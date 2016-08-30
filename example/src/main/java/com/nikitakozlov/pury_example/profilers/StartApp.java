package com.nikitakozlov.pury_example.profilers;

public final class StartApp {
    public static final String METHOD_ID = "App Start";

    public static final String TOP_STAGE ="App Start";
    public static final int TOP_STAGE_ORDER = 0;

    public static final String SPLASH_SCREEN = "Splash Screen";
    public static final int SPLASH_SCREEN_ORDER = TOP_STAGE_ORDER + 1;

    public static final String SPLASH_LOAD_DATA = "Splash Load Data";
    public static final int SPLASH_LOAD_DATA_ORDER = SPLASH_SCREEN_ORDER + 1;

    public static final String MAIN_ACTIVITY_LAUNCH = "Main Activity onCreate()";
    public static final int MAIN_ACTIVITY_LAUNCH_ORDER = SPLASH_SCREEN_ORDER + 1;

    public static final String MAIN_ACTIVITY_CREATE = "Main Activity onCreate()";
    public static final int MAIN_ACTIVITY_CREATE_ORDER = MAIN_ACTIVITY_LAUNCH_ORDER + 1;



}