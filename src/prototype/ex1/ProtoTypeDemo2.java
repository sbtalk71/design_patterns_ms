package prototype.ex1;

class MyProduct implements Cloneable {
    public MyProduct() {
        System.out.println("MyProduct Created..");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }
}


public class ProtoTypeDemo2 {
    public static void main(String[] args) throws Exception{
        MyProduct prototype=new MyProduct();

        MyProduct p1=(MyProduct) prototype.clone();
        MyProduct p2=(MyProduct) prototype.clone();
        MyProduct p4=(MyProduct) prototype.clone();
        MyProduct p3=(MyProduct) prototype.clone();
    }
}


