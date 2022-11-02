import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _609_FindDuplicateFile {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (String path : paths) {
            String[] p = path.split(" ");
            for (int i = 1; i < p.length; ++i) {
                String f = p[i];
                int idx = f.indexOf("(");
                String filename = f.substring(0, idx);
                String content = f.substring(idx + 1, f.length() - 1);
                sb.setLength(0);
                sb.append(p[0]).append("/").append(filename);
                map.computeIfAbsent(content, k -> new ArrayList()).add(sb.toString());
            }
        }
        List<List<String>> ans = new ArrayList();
        for (List<String> v : map.values()) {
            if (v.size() > 1) {
                ans.add(v);
            }
        }
        return ans;
    }
}
