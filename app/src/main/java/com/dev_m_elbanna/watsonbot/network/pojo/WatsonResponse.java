package com.dev_m_elbanna.watsonbot.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created By Mohamed El Banna On 4/3/2020
 **/

public class WatsonResponse {


    @SerializedName("input")
    private InputBean input;
    @SerializedName("output")
    private OutputBean output;
    @SerializedName("context")
    private ContextBean context;
    @SerializedName("intents")
    private List<IntentsBean> intents;
    @SerializedName("entities")
    private List<?> entities;

    public InputBean getInput() {
        return input;
    }

    public void setInput(InputBean input) {
        this.input = input;
    }

    public OutputBean getOutput() {
        return output;
    }

    public void setOutput(OutputBean output) {
        this.output = output;
    }

    public ContextBean getContext() {
        return context;
    }

    public void setContext(ContextBean context) {
        this.context = context;
    }

    public List<IntentsBean> getIntents() {
        return intents;
    }

    public void setIntents(List<IntentsBean> intents) {
        this.intents = intents;
    }

    public List<?> getEntities() {
        return entities;
    }

    public void setEntities(List<?> entities) {
        this.entities = entities;
    }

    public static class InputBean {

        @SerializedName("text")
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class OutputBean {
        @SerializedName("generic")
        private List<GenericBean> generic;
        @SerializedName("text")
        private List<String> text;
        @SerializedName("nodes_visited")
        private List<String> nodesVisited;
        @SerializedName("log_messages")
        private List<?> logMessages;

        public List<GenericBean> getGeneric() {
            return generic;
        }

        public void setGeneric(List<GenericBean> generic) {
            this.generic = generic;
        }

        public List<String> getText() {
            return text;
        }

        public void setText(List<String> text) {
            this.text = text;
        }

        public List<String> getNodesVisited() {
            return nodesVisited;
        }

        public void setNodesVisited(List<String> nodesVisited) {
            this.nodesVisited = nodesVisited;
        }

        public List<?> getLogMessages() {
            return logMessages;
        }

        public void setLogMessages(List<?> logMessages) {
            this.logMessages = logMessages;
        }

        public static class GenericBean {


            @SerializedName("response_type")
            private String responseType;
            @SerializedName("text")
            private String text;

            public String getResponseType() {
                return responseType;
            }

            public void setResponseType(String responseType) {
                this.responseType = responseType;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }
    }

    public static class ContextBean {


        @SerializedName("conversation_id")
        private String conversationId;
        @SerializedName("system")
        private SystemBean system;

        public String getConversationId() {
            return conversationId;
        }

        public void setConversationId(String conversationId) {
            this.conversationId = conversationId;
        }

        public SystemBean getSystem() {
            return system;
        }

        public void setSystem(SystemBean system) {
            this.system = system;
        }

        public static class SystemBean {

            @SerializedName("initialized")
            private boolean initialized;
            @SerializedName("dialog_turn_counter")
            private float dialogTurnCounter;
            @SerializedName("dialog_request_counter")
            private float dialogRequestCounter;
            @SerializedName("_node_output_map")
            private NodeOutputMapBean nodeOutputMap;
            @SerializedName("last_branch_node")
            private String lastBranchNode;
            @SerializedName("branch_exited")
            private boolean branchExited;
            @SerializedName("branch_exited_reason")
            private String branchExitedReason;
            @SerializedName("dialog_stack")
            private List<DialogStackBean> dialogStack;

            public boolean isInitialized() {
                return initialized;
            }

            public void setInitialized(boolean initialized) {
                this.initialized = initialized;
            }

            public float getDialogTurnCounter() {
                return dialogTurnCounter;
            }

            public void setDialogTurnCounter(float dialogTurnCounter) {
                this.dialogTurnCounter = dialogTurnCounter;
            }

            public float getDialogRequestCounter() {
                return dialogRequestCounter;
            }

            public void setDialogRequestCounter(float dialogRequestCounter) {
                this.dialogRequestCounter = dialogRequestCounter;
            }

            public NodeOutputMapBean getNodeOutputMap() {
                return nodeOutputMap;
            }

            public void setNodeOutputMap(NodeOutputMapBean nodeOutputMap) {
                this.nodeOutputMap = nodeOutputMap;
            }

            public String getLastBranchNode() {
                return lastBranchNode;
            }

            public void setLastBranchNode(String lastBranchNode) {
                this.lastBranchNode = lastBranchNode;
            }

            public boolean isBranchExited() {
                return branchExited;
            }

            public void setBranchExited(boolean branchExited) {
                this.branchExited = branchExited;
            }

            public String getBranchExitedReason() {
                return branchExitedReason;
            }

            public void setBranchExitedReason(String branchExitedReason) {
                this.branchExitedReason = branchExitedReason;
            }

            public List<DialogStackBean> getDialogStack() {
                return dialogStack;
            }

            public void setDialogStack(List<DialogStackBean> dialogStack) {
                this.dialogStack = dialogStack;
            }

            public static class NodeOutputMapBean {


                @SerializedName("node_8_1585737807063")
                private Node81585737807063Bean node81585737807063;

                public Node81585737807063Bean getNode81585737807063() {
                    return node81585737807063;
                }

                public void setNode81585737807063(Node81585737807063Bean node81585737807063) {
                    this.node81585737807063 = node81585737807063;
                }

                public static class Node81585737807063Bean {
                    @SerializedName("0")
                    private List<Integer> $0;

                    public List<Integer> get$0() {
                        return $0;
                    }

                    public void set$0(List<Integer> $0) {
                        this.$0 = $0;
                    }
                }
            }

            public static class DialogStackBean {

                @SerializedName("dialog_node")
                private String dialogNode;

                public String getDialogNode() {
                    return dialogNode;
                }

                public void setDialogNode(String dialogNode) {
                    this.dialogNode = dialogNode;
                }
            }
        }
    }

    public static class IntentsBean {

        @SerializedName("intent")
        private String intent;
        @SerializedName("confidence")
        private float confidence;

        public String getIntent() {
            return intent;
        }

        public void setIntent(String intent) {
            this.intent = intent;
        }

        public float getConfidence() {
            return confidence;
        }

        public void setConfidence(float confidence) {
            this.confidence = confidence;
        }
    }
}
