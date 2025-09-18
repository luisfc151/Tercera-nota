public class main {
    public static void changeBox(Box newBox) {
        newBox.size = 20;
    }

    public static void main(String[] args) {
        Box box = new Box(50);
        System.out.println("antes de cambiar el tamaño: " + box.size);
        changeBox(box);
        System.out.println("después de cambiar el tamaño: " + box.size);
    }
}

class Box {
    public int size;

    public Box(int size) {
        this.size = size;
    }
}
