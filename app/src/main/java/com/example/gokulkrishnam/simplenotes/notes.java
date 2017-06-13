package com.example.gokulkrishnam.simplenotes;

import java.io.Serializable;

/**
 * Created by GOKULKRISHNA M on 13-06-2017.
 */

public class notes implements Serializable {
    public static final String EXTRA = "com.your.package.notes_EXTRA";
    private String mtitle;

    public notes(String mtitle) {
        this.mtitle = mtitle;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }


}
