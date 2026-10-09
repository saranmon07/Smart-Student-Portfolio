import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Notification {
    private int notificationId;
    private int userId;
    private String message;
    private String type;
    private boolean isRead;
    private Date createdAt;

    public Notification(int notificationId, int userId, String message, String type,
                        boolean isRead, Date createdAt) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.message = message;
        this.type = type;
        this.isRead = isRead;
        this.createdAt = createdAt;
    }

    public void sendNotification() {
        System.out.println("Notification sent: " + message);
    }

    public void markAsRead() {
        isRead = true;
        System.out.println("Notification marked as read.");
    }

    public List<Notification> getNotifications() {
        List<Notification> notifications = new ArrayList<>();
        notifications.add(this);
        return notifications;
    }
}
