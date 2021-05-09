
public class BST {

	public static void main(String[] args) {
		BinarySearchTree bsT = new BinarySearchTree();
		bsT.insertBST('G');
		bsT.insertBST('I');
		bsT.insertBST('H');
		bsT.insertBST('D');
		bsT.insertBST('B');
		bsT.insertBST('M');
		bsT.insertBST('N');
		bsT.insertBST('A');
		bsT.insertBST('J');
		bsT.insertBST('E');
		bsT.insertBST('Q');
		
		System.out.printf("\nBinary Tree >>> ");
		bsT.printBST();
		
		System.out.printf("Is There\"A\"? >>> ");
		TreeNode p1 = bsT.searchBST('A');
		if(p1 != null)
			System.out.printf("서칭 성공 : %c\n", p1.data);
		else
			System.out.printf("서칭 실패");
		

	}

}
