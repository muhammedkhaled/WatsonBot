package com.dev_m_elbanna.watsonbot;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dev_m_elbanna.watsonbot.network.WatsonClient;
import com.dev_m_elbanna.watsonbot.network.pojo.MessageResponse;
import com.dev_m_elbanna.watsonbot.network.pojo.WatsonRequest;
import com.dev_m_elbanna.watsonbot.network.pojo.WatsonResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created By Mohamed El Banna On 4/3/2020
 **/

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private EditText etMessage;
    private Button btnSend;
    private RecyclerView mRecyclerView;

    private LinearLayoutManager mLayoutManger;
    MessageAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        etMessage = findViewById(R.id.etMessage);
        btnSend = findViewById(R.id.btnSend);
        mRecyclerView = findViewById(R.id.rv_messages);

        mLayoutManger = new LinearLayoutManager(this, RecyclerView.VERTICAL, true);
        mRecyclerView.setLayoutManager(mLayoutManger);
        mAdapter = new MessageAdapter(new ArrayList<>());
        mRecyclerView.setAdapter(mAdapter);


        btnSend.setOnClickListener(view -> {
            String mMessage = etMessage.getText().toString().trim();
            if (mMessage == null && mMessage.isEmpty()) {
                Toast.makeText(this, "Enter Message", Toast.LENGTH_SHORT).show();
                return;
            }

            MessageResponse userMessage = new MessageResponse("Me", mMessage);
            mAdapter.addSingleItem(userMessage);
            sendMessage();
            etMessage.setText("");
        });
    }


    void sendMessage() {
        WatsonRequest.InputBean inputBean = new WatsonRequest.InputBean();
        inputBean.setText(etMessage.getText().toString().trim());
        WatsonRequest mRequest = new WatsonRequest();
        mRequest.setInput(inputBean);

        doChatBotApiCall(mRequest);
    }

    void doChatBotApiCall(WatsonRequest mWatsonRequest) {
        WatsonClient.getInstance().getBotReplay(mWatsonRequest).enqueue(new Callback<WatsonResponse>() {
            @Override
            public void onResponse(Call<WatsonResponse> call, Response<WatsonResponse> response) {
                Log.d(TAG, "onResponse: " + response.body().getOutput().getText().get(0));
                WatsonResponse mResponse = response.body();
                MessageResponse botMessage = new MessageResponse("Bot", mResponse.getOutput().getText().get(0));
                mAdapter.addSingleItem(botMessage);
            }

            @Override
            public void onFailure(Call<WatsonResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());
            }
        });
    }

}
