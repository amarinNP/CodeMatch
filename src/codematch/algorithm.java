/* CodeMatch */
package codematch;



import java.util.HashMap;

public class algorithm {
    
    // ฟังก์ชันเรียงราคาสินค้าจากแพงที่สุดไปถูกที่สุด
    public static Item[] sorting(Item[] items, int m){
        int pass, max_index, i;
        Item temp;
        for(pass = 0; pass < m-1; pass++){
            max_index = pass;
            for(i = pass+1; i < m; i++){
                if(items[i].getPrice()+items[i].getShipping() > items[max_index].getPrice()+items[max_index].getShipping()){
                    max_index = i;
                }
            }
            // Swap items[max_index] and items[pass]
            temp = items[pass];
            items[pass] = items[max_index];
            items[max_index] = temp;
        }
        return items;
    }    

    // กรณีสินค้าหลายชิ้น โค้ดหลายชิ้น
    public static HashMap<String, Integer> matchCoupon(Item[] items, Coupon[] coupon){
        int i, j;
        double discount = 0, temp=0;
        int index=-1;
        HashMap<String, Integer> data = new HashMap<String, Integer>();
        for(i=0;i<items.length;i++){ // loop ตามจำนวนสินค้า
            for(j=0;j<coupon.length;j++){ // loop จำนวนโค้ด
                if((items[i].getType().equals(coupon[j].getType()) || coupon[j].getType().equals("Normal")) && items[i].getPrice() >= coupon[j].getMin() && coupon[j].getLimit() < 3){
                    // System.out.println("Im in for J if");
                    if(coupon[j] instanceof Free_shipping){
                        if(37 > items[i].getShipping()){
                            discount = items[i].getShipping();
                        }
                        else{
                            discount = 37;
                        }
                    }
                    else if(coupon[j] instanceof Percentage_discount){
                        discount = items[i].getPrice() *  ((double)(((Percentage_discount)coupon[j]).getPercent()) / (double)100);
                        // System.out.println("Percent");
                    }
                    else{
                        discount = ((Absolute_discount)coupon[j]).getDiscount();
                    }
                }

                if(discount > coupon[j].getMax() && (!(coupon[j] instanceof Absolute_discount))){
                    discount = coupon[j].getMax();
                    // System.out.println("getMax loop");
                }
                if (discount > temp && discount > 0){
                    temp = discount;
                    index = j;
                    // System.out.println("discount > temp && discount != 0");
                }
            }
            if(index != -1){
                if(coupon[index].getLimit() < 3){ // เช็คว่าโค้ดถึงลิมิตยัง
     
                    data.put(items[i].getName(), index);
                    System.out.println(items[i].getName() + " Match coupon " + (index)); // พิมพ์ว่าสินค้า[i] เหมาะกับโค้ดตัวไหน
                    coupon[index].change_limit(); // เพิ่มจำนวนครั้งที่ใช้
                    if(!(coupon[index] instanceof Free_shipping)){
                        coupon[index].change_max(temp); // เปลี่ยนค่าส่วนลดสูงสุด
                    }
                    // reset value
                    temp = 0; 
                    index = -1;
                }
            }
        }
        return data;
    }

    public static void main(String[] args) {
        System.out.println("Algorithm");

        
    }
}
abstract class Coupon {
    // ประเภทโค้ด -> โค้ดส่งฟรี โค้ดร้านค้า โค้ดของแอพ
    protected String type_coupon;
    protected String category_coupon;
    // ราคาขั้นต่ำในการใช้โค้ด
    protected int min_price;
    // จำนวนสูงสุดที่โค้ดจะลดได้ -> ลดสูงสุดกี่บาท
    protected double max_discount;

    // เก็บจำนวนที่โค้ดใช้กับสินค้าไปแล้วกี่ชิ้น (สูงสุด 3)
    protected int limit=0;

    protected void set_type_coupon(String type){
        type_coupon = type;
    }
    protected void set_category_coupon(String category){
        category_coupon = category;
    }

    protected void set_min_price(int price){
        min_price = price;
    }
    protected void set_max_discount(double price){
        max_discount = price;
    }

    protected void change_max(double p){
        max_discount -= p;
    }

    protected void change_limit(){
        limit++;
    }

    protected int getLimit(){
        return limit;
    }

    public String getType(){
        return type_coupon;
    }
    public String getCategory(){
        return category_coupon;
    }

    public int getMin(){
        return min_price;
    }

    public double getMax(){
        return max_discount;
    }
}

// โค้ดแบบส่งฟรี
class Free_shipping extends Coupon{
    
    public Free_shipping(){
        max_discount = 37;
    }


}


// โค้ดแบบลดราคา
abstract class Discount extends Coupon{

}
// โค้ดลดราคาแบบ percent
class Percentage_discount extends Discount{
    private int percent;
    public Percentage_discount(int value){
        percent = value;
    }

    public int getPercent(){
        return percent;
    }
}
// โค้ดลดราคาแบบ ตามจำนวนเงิน
class Absolute_discount extends Discount{
    private double discount;
    public Absolute_discount(double value){
        discount = value;
    }

    public double getDiscount(){
        return discount;
    }
 
}

class Item {
    private String name;
    private double price;
    private double shipping;
    private String type;

    public Item(String n, double p, double s,String c){
        name = n;
        price = p;
        shipping = s;
        type = c;
    }

    public String getName(){
        return name;
    }


    public double getPrice(){
        return price;
    }

    public double getShipping(){
        return shipping;
    }

    public String getType(){
        return type;
    }
}