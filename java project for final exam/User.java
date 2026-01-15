package finalExam;

abstract class User {
    private String userId;
    private String userName;

    User(String userId, String userName){
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    // abstract method to get role
    abstract String getRole();
}