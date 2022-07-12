import java.util.Date;

public class Message {
    String token;
    Date date;
    String text;
    public Message(String token, String text, Date date)
    {
        this.text = text;
        this.token = token;

        this.date = date;
    }
    public void setToken(String token){
        this.token = token;

    }
    public void setDate(Date date){
        this.date = date;

    }
    public void setText(String text){
        this.text = text;

    }
    public String getToken(){
        return token;

    }
    public Date getDate(){
        return date;

    }
    public String getText(){
        return text;

    }

}
