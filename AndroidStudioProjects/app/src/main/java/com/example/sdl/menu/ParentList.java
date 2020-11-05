package com.example.sdl.menu;

import com.example.sdl.menu.ChildList;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ParentList extends ExpandableGroup<ChildList> {



    public ParentList(String title, List<ChildList> items) {
        super(title, items);
    }

}
