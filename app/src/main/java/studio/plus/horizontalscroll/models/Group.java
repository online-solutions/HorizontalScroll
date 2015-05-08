package studio.plus.horizontalscroll.models;

/**
 * Created by SUCCESS\phungdinh on 5/8/15.
 */
public class Group {
    private String title;
    private int realValue;
    private int oldValue;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRealValue() {
        return realValue;
    }

    public void setRealValue(int realValue) {
        this.realValue = realValue;
    }

    public int getOldValue() {
        return oldValue;
    }

    public void setOldValue(int oldValue) {
        this.oldValue = oldValue;
    }
}
