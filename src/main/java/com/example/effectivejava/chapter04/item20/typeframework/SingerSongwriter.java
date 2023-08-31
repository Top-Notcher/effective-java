package com.example.effectivejava.chapter04.item20.typeframework;

public interface SingerSongwriter extends Singer, Songwriter {

    AutoClip strum();
    void actSensitive();
}
