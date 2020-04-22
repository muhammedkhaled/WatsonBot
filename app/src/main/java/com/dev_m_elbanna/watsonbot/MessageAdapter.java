package com.dev_m_elbanna.watsonbot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.dev_m_elbanna.watsonbot.network.pojo.MessageResponse;

import java.util.List;

/**
 * Created By Mohamed El Banna On 4/5/2020
 **/
public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private List<MessageResponse> mMessagesList;

    public MessageAdapter(List<MessageResponse> mMessagesList) {
        this.mMessagesList = mMessagesList;
    }


    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message, parent, false);
        return new MessageViewHolder(view);
    }

    public class MessageViewHolder extends RecyclerView.ViewHolder {

        public TextView messageText;
        public TextView displayName;
        public TextView displayTime;


        public MessageViewHolder(View itemView) {
            super(itemView);

            messageText = itemView.findViewById(R.id.message_text_layout);
            displayName = itemView.findViewById(R.id.name_text_layout);
            displayTime = itemView.findViewById(R.id.time_text_layout);
        }

    }

    public void addItems(List<MessageResponse> messages) {
        mMessagesList.clear();
        mMessagesList.addAll(messages);
        notifyDataSetChanged();
    }

    public void addSingleItem(MessageResponse messages) {
        mMessagesList.add(messages);
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(final MessageViewHolder holder, int position) {

        MessageResponse mMessageBean = mMessagesList.get(position);

        holder.displayName.setText(mMessageBean.getUserName());
        holder.messageText.setText(mMessageBean.getMessage());
        holder.displayTime.setText("Time: " + mMessageBean.getMessageTime());
    }

    @Override
    public int getItemCount() {
        return mMessagesList.size();
    }
}
