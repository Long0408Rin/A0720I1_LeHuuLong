package B12_Java_Collection_Framework.Exercise;

import java.util.*;

public class ProductManager implements Comparator<Product>  {
     static List<Product> p = new ArrayList<>();
  static  Scanner input = new Scanner(System.in);
    public static void showAll(){
        for (Product s: p) {
            System.out.println(s.toString());
        }
    }
    public static void add(){
//        Scanner input = new Scanner(System.in);
        System.out.println("Plz enter Name : ");
        String name = input.nextLine();
        System.out.println("Plz enter ID : ");
        int id = input.nextInt();
        System.out.println("Plz enter Value : ");
        int value = input.nextInt();
        p.add(new Product(id,name,value));

    }

//    public ArrayList<Product> searchByName(ArrayList<Product> list, String key){
//        ArrayList<Product> result = new ArrayList<>();
//        String patten = ".*" + key + ".*";
//        for(int i = 0; i <p.size(); i++){
//            Product pr = list.get(i);
//            if(pr.getName().matches(patten)){
//                result.add(pr);
//            }
//        }

    public static void searchByName(){
        String input_Name = input.nextLine();
        for (Product search_name:p) {
            if(input_Name.equalsIgnoreCase(search_name.getName())){
                System.out.println(search_name);
            }
            else
                System.out.println("Product not found");
        }
    }
    public static void xoaProductTheoId(){
        System.out.println("Moi nhap Id");
        int input_id = input.nextInt();
        for(Product search_Id:p){
            if(input_id == search_Id.getId()){
                p.remove(p.indexOf(input_id));
                System.out.println("Da xoa phan tu co ID: "+input_id);
            }
            else{
                System.out.println("Khong co san pham nao co ID: "+input_id );
            }
            showAll();
        }
    }

    @Override
    public int compare(Product p1, Product p2){
            if(p1.getValue() > p2.getValue()){
                return 1;
            }else if(p1.getValue() > p2.getValue()){
                return 0;}
            else {
                return -1;
            }
    }
    public static void suaThongTinTheoID(){
        System.out.println("Moi nhap Id");
        int input_id = input.nextInt();
        for(Product search_Id:p){
            if(input_id == search_Id.getId()){
                System.out.println("Moi nhap lai ten San Pham");
                String input_editName = input.nextLine();

                System.out.println("Moi nhap lai gia tri");
                int input_editValue = input.nextInt();

                search_Id.setName(input_editName);
                search_Id.setValue(input_editValue);
                ;
            }
            else{
                System.out.println("Khong co san pham nao co ID: "+input_id );
            }
            showAll();
        }
    }
    public static void main(String[] args){
        Product p1 = new Product(1,"Sua",10000);
        Product p2 = new Product(2,"Gao",15000);
        Product p3 = new Product(3,"Thit",120000);
        Product p4 = new Product(4,"Bia",8000);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        System.out.println("=================Menu================");
        System.out.println("Moi nhap lua chon: "+
                "\n1.Them \n2.Sua Thong Tin \n3.Xoa San pham theo ID \n4.Tim kiem  \n5.Sap xep  \n6.Hien thi");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                add();
                break;
            case 2:
                suaThongTinTheoID();
                break;
            case 3:
                xoaProductTheoId();
                break;
            case 4:
                searchByName();
                break;
            case 5:
                System.out.println("Sap xep thu tu +" +
                                    "\n1.Tang dan "+
                                    "\n2.Giam dan");
                int chon_sx = input.nextInt();
                switch(chon_sx){
                    case 1:
                       
                        System.out.println("Theo thu tu tang dan");
                        for (Product pro:p) {
                            System.out.println(pro);
                        }
                        break;
                    case 2:
                        System.out.println("Theo thu tu giam dan");
                        for(int i= p.size()-1; i >= 0; i--){
                            System.out.println(p.get(i));
                        }
                        break;
                }

                break;

            case 6:
                showAll();

        }
    }
}
