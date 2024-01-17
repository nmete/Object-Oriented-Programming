package Interface;

public class Button {

    public OnclickLister onclickLister;
    interface OnclickLister{
        public void click();
    }

    class SmallButton{
        public void display(){
            System.out.println("display inner class");
        }
    }
    public void getOnClickListner(){
        if(onclickLister != null){
            onclickLister.click();
        }
    }
}
