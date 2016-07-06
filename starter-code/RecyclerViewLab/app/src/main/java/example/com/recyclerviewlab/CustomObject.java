package example.com.recyclerviewlab;

/**
 * Created by roosevelt on 7/5/16.
 *
 Custom Objects

 Create two custom Java objects that hold this data:
 The first object should hold a title, a description, and a color.
 The second object should hold a title, a description, a color, and a check to see if the item was selected.
 Make sure you create getters/setters and constructors that will help you with the requirements.
 */
public class CustomObject {
    private String mTitle;
    private String mDescription;
    private String mColor;

    public CustomObject() {
        this.mTitle = "My Title";
        this.mDescription = "A description";
        this.mColor = "#FF0000";

    }

    public CustomObject(String mTitle, String mDescription, String mColor) {

        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mColor = mColor;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String mColor) {
        this.mColor = mColor;
    }
}
