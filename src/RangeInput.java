public class RangeInput {
    private int currentTemperature, minTemperature ,maxTemperature;

    private void TemperatureControl() {
        currentTemperature = (minTemperature + maxTemperature) / 2;
    }


    public  RangeInput(){
        maxTemperature = 60;
        minTemperature = 80;
        TemperatureControl();
    }

    public RangeInput(int max,int min){
            maxTemperature = max;
            minTemperature = min;
            TemperatureControl();

    }

    public void Up(){
         currentTemperature = Math.min(currentTemperature + 1,maxTemperature);
    }
    public void Down(){
        currentTemperature = Math.max(currentTemperature - 1,minTemperature);
    }
    public int getCurrentTemperature(){
        return currentTemperature;
    }


}
