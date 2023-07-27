
public class main {
    public static void main(String[] args){

        BinTree<Integer> tree = new BinTree<>();

        tree.add(100);
        tree.add(150);
        tree.add(140);
        tree.add(135);
        tree.add(136);
        tree.add(145);
        tree.add(148);
        tree.add(180);
        tree.add(143);

        tree.add(170);
        tree.add(200);
        tree.add(220);
        tree.add(50);
        tree.add(40);
        tree.add(32);

        tree.add(46);
        tree.add(65);
        tree.add(55);
        tree.add(78);
        tree.add(68);

        tree.remove(145);
        tree.remove(135);
        tree.remove(220);

        tree.print();
    }
}