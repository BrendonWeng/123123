public class Item {
    private static double minPrice;
    private static String name;
    private static String description;
    private static boolean auctionClosed;
    private static double autoWin; //bonus: set a high limit that is a buy it now price
    private static String highestBidder;

    public Item(String name, String description, double minimumPrice) {
        this.name = name;
        this.description = description;
        minPrice = Math.max(minimumPrice,Params.MIN_STARTING_PRICE); //Bonus: set minimum starting price > 0 for every item
        this.auctionClosed = false;
        this.autoWin = minPrice * 10;
    }

    public static double getAutoWin() {
        return autoWin;
    }

    public static String getHighestBidder() {
        return highestBidder;
    }

    public void setHighestBidder(String highestBidder) {
        this.highestBidder = highestBidder;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static double getMinPrice() {
        return minPrice;
    }

    public static void setMinPrice(double minimumPrice) {
        minPrice = minimumPrice;
    }

    public static String isValidBid(double bid) {
        if (bid <= Params.MIN_BID_INCREASE + minPrice ) {
            return "Bid amount too low";
        }
        else if (auctionClosed) {
            return "Auction is closed";
        }
        return "true";
    }

    public static boolean checkAuctionTermination(double bidPrice) {
        if(bidPrice >= autoWin) {
            auctionClosed = true;
            //TODO: notifyClosedAuction();
        }
        return auctionClosed;
    }
}
