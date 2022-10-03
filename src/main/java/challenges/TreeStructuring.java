package challenges;

public class TreeStructuring {

    public static int findTreeDepth(TreeNode root) {


        return 0;
    }

    static class TreeNode {
        int value;
        TreeNode leftLeaf;
        TreeNode rightLeaf;

        public TreeNode(int value, TreeNode leftLeaf, TreeNode rightLeaf) {
            this.value = value;
            this.leftLeaf = leftLeaf;
            this.rightLeaf = rightLeaf;
        }
    }
}
