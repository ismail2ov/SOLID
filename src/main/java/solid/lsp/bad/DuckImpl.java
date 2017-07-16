package solid.lsp.bad;

public class DuckImpl implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack! Quack! Quack!");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming");
    }
}
