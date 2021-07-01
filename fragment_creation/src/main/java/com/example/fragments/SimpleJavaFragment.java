package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class SimpleJavaFragment extends Fragment {
    public SimpleJavaFragment() {
    }

    //Если есть пользовательский конструктор, то обязательно нужно переопределить конструтор по умолчанию
    //Иначе приложение упадет при перевороте экрана. Андройд не сможет пересоздать фрагмент
    //Вообще лучше так не делать и все параметры передавать используя фабричный метод и bundle
    public SimpleJavaFragment(int a) {
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        return view;
    }
}
