package app.Database;

import java.sql.Timestamp;

public class GroupMessageDB {
    private int messageId;
    private int groupId;
    private String sender;
    private String message;
    private Timestamp sentAt;

    public GroupMessageDB(int messageId, int groupId, String sender, String message, Timestamp sentAt) {
        this.messageId = messageId;
        this.groupId = groupId;
        this.sender = sender;
        this.message = message;
        this.sentAt = sentAt;
    }

    public int getMessageId() {
        return messageId;
    }

    public int getGroupId() {
        return groupId;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public Timestamp getSentAt() {
        return sentAt;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s: %s", sentAt, sender, message);
    }
}