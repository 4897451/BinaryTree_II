public class Node
{
    Node(int key, String name)
    {
        this.key = key;
        this.name = name;
    }

    public String toString()
    {
        return name + " has the key " + key;

        /*
         * return name + " has the key " + key + "\nLeft Child: " + leftChild +
         * "\nRight Child: " + rightChild + "\n";
         */
    }
    int key;
    Node leftChild;
    String name;
    Node rightChild;
}
