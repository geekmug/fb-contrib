import java.util.List;


public class AIOB_Sample 
{
    int[] fa = new int[4];
    int[] fb;
    
    public void testOutOfBounds()
    {
        int[] a = new int[4];
        
        a[4] = 2;
        fa[4] = 2;
    }
    
    public void testUnallocated()
    {
        int[] b = null;
        
        b[4] = 4;
        fb[4] = 4;
    }
    
    public int[] fpPlusPlusNotRecognized(List<String> l) {
        int size = 0;
        
        for (String s : l) {
            size++;
        }
        
        int[] data = new int[size];
        
        data[0] = 0;
        return data;
    }
}
