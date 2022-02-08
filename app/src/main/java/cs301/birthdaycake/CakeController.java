package cs301.birthdaycake;

public class CakeController {
    private CakeView aCakeView;
    private CakeModel aCakeModel;


    public CakeController(CakeView cvReference) {
        aCakeView = cvReference;
        aCakeModel = aCakeView.getCakeModelReference();
    }
}
