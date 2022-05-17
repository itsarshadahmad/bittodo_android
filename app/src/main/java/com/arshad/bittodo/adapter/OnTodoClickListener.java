package com.arshad.bittodo.adapter;

import com.arshad.bittodo.model.Task;

public interface OnTodoClickListener {
    void onTodoClick(Task task);

    void onTodoRadioButtonClick(Task task);
}
