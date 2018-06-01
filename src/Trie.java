import java.util.LinkedList;
import java.util.List;

class Trie {

    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode(' ');
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[] wordarray = word.toCharArray();
        TrieNode t = root;
        for (int j = 0; j < wordarray.length - 1; j++) {
            int i = t.indexOf(wordarray[j]);
            if (i == -1) {
                t.list.add(new TrieNode(wordarray[j]));
                t = t.list.get(t.list.size() - 1);
            } else {
                t = t.list.get(i);
            }
        }
        int i = t.indexOf(wordarray[wordarray.length - 1]);
        if (i == -1) {
            TrieNode n = new TrieNode(wordarray[wordarray.length - 1]);
            n.f = true;
            t.list.add(n);
        } else {
            t.list.get(i).f = true;
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char[] wordarray = word.toCharArray();
        TrieNode t = root;
        for (int j = 0; j < wordarray.length - 1; j++) {
            int i = t.indexOf(wordarray[j]);
            if (i != -1) {
                t = t.list.get(i);
            } else {
                return false;
            }
        }
        int i = t.indexOf(wordarray[wordarray.length - 1]);
        return i != -1 && t.list.get(i).f;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char[] wordarray = prefix.toCharArray();
        TrieNode t = root;
        for (char c : wordarray) {
            int i = t.indexOf(c);
            if (i != -1) {
                t = t.list.get(i);
            } else {
                return false;
            }
        }
        return true;
    }

    class TrieNode {
        char c;
        boolean f;
        List<TrieNode> list;

        private TrieNode(char c) {
            this.c = c;
            f = false;
            list = new LinkedList<>();
        }

        private int indexOf(char c) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).c == c) {
                    return i;
                }
            }
            return -1;
        }
    }
}

