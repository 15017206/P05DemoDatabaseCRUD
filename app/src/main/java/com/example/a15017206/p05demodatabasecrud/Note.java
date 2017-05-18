package com.example.a15017206.p05demodatabasecrud;

import java.io.Serializable;

/**
 * Created by 15017206 on 18/05/2017.
 */

public class Note implements Serializable {
    private int id;
    private String noteContent;

    public Note(int id, String noteContent) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() {
        return id;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

}
