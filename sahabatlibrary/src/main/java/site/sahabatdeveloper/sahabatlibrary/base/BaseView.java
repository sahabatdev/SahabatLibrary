package site.sahabatdeveloper.sahabatlibrary.base;

/**
 * This is the file interface of the activity that is implement general abstract method
 * @author by Alchemy Framework (http://alchemy.sahabatdeveloper.site/) - Politeknik Elektronika Negeri Surabaya
 */
public interface BaseView {
    /**
     * This Method contain toast message for activity and will be accessed in presenter
     * @param message for message toast
     */
    public void onMessage(String message);

    /**
     * This method contain show progress loading
     */
    public void onShowProgressDialog();

    /**
     * This method contain hide progress loading
     */
    public void onHideProgressDialog();
}
