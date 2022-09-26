public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();
        Tree.Node root = new Tree.Node(10);
        System.out.println("Iniciando arvore Binaria...");
        System.out.println("Valor raiz da arvore: " + root.value);
        tree.insert(root,10);
        tree.insert(root,5);
        tree.insert(root,1);
        tree.insert(root,6);
        tree.insert(root,19);
        tree.insert(root,17);
        tree.insert(root,21);
        System.out.println("Ordenando a arvore…");
        tree.traverseInOrder(root);
    }
}