package com.eventxorizons;

import com.eventxorizons.momento.Editor;
import com.eventxorizons.momento.History;

public class Main {

    public static void main(String[] args) {


        Editor editor = new Editor();

        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop()); // should undo and return b

        System.out.println(editor.getContent());

    }
}
