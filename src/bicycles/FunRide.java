package bicycles;

import java.util.ArrayList;

import bicycles.BicycleType;

public class FunRide {

   private ArrayList<Bicycle> bikeList = new ArrayList<>();
    private BicycleType bike;
    private int maxNumOfBikes;

    public FunRide(int maxNumOfBikes){
        this.maxNumOfBikes = maxNumOfBikes;
    }

    public String accept(Bicycle bicycle){
        final String accepted = "Accepted";
        final String rejected = "Rejected";

        if (bikeList.size() < maxNumOfBikes) {
            bikeList.add(bicycle);

            return accepted;
        }
        else{

            return rejected;
        }
    }

    public int getEnteredCount(){
        return bikeList.size();
    }

    public int getCountForType(BicycleType bike) {
        int getCount = 0;


        for (Bicycle x: bikeList) {
            if (x.getBicycleType() == bike) {
                getCount += 1;
            }
        }

            return getCount;
    }


}
