package com.walking.lesson20_exceptions.task1_catchException.model;

public enum FileType {
    TEXT("текстовый файл"),
    IMAGE("изображение"),
    AUDIO("аудио файл"),
    VIDEO("видео файл");

    private String name;

    FileType(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}
