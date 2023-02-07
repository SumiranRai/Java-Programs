//Creating the structure of customMap
public class customMap {
    String key;
    Object value;
    customMap left, right;

    //Constructor for customMap node
    public customMap (String k, Object v) {
        key = k;
        value = v;
        left = right = null;
    }

    //Insert function
    public void insert (String key, Object value) {
        if (this.left == null) {
            this.left = new customMap(key, value);
        } else if (this.right == null) {
            this.right = new customMap(key, value);
        } else {
            this.right.insert(key, value);
        }
    }

    //Print function
    public void print() {
        System.out.println(this.key + " - " + this.value);
        if (this.left != null) {
            this.left.print();
        }
        if (this.right != null) {
            this.right.print();
        }
    }

    //Search function
    public customMap Search(customMap root, String key) {
        if (root == null)
            return null;

        if (root.key == key)
            return root;

        //recursion on left subtree
        customMap res1 = Search(root.left, key);
        if(res1 != null) {
            return res1;
        }

        //node is not found in left, so recursion on right subtree
        customMap res2 = Search(root.right, key);
        if(res2 !=null) {
            return res2;
        }
        return null;
    }

    public static void main (String[] args) {
        customMap map = new customMap("jp", "Japan");

        map.insert("us", "USA");
        map.insert("gb", "Great Britain");
        map.insert("in", "India");
        map.insert("gr", "Germany");
        map.insert("ky", "Kenya");
        map.insert("ch", "China");
        map.insert("dm", "Denmark");

        map.print();

        customMap k = map.Search(map, "in");
        if (k != null) {
            System.out.println("\nMatch found : " + k.key + " - " + k.value);
        } else System.out.println("\nNo match found!");

        customMap s = map.Search(map, "lt");
        if (s != null) {
            System.out.println("\nMatch found : " + s.key + " - " + s.value);
        } else System.out.println("\nNo match found!");
    }//end of main
}//end of file
