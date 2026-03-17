public class ProblemThisKeyword {

    int i;

/*    void setValue(int x){  problem
 *       i = x;
 *  }
*/

    void setValue(int i){ // solution by this keyword
        this.i = i;
    }

    void show(){
        System.out.println(i);
    }
}
