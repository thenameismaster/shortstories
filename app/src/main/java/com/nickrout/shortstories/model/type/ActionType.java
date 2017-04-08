package com.nickrout.shortstories.model.type;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;

import com.nickrout.shortstories.R;
import com.nickrout.shortstories.util.BitmapUtil;

public enum ActionType {

    UNKNOWN(R.color.color_primary, R.drawable.ic_unknown_black_24dp),
    AGREE(R.color.light_blue_600, R.drawable.ic_thumb_up_black_24dp),
    ATTACK(R.color.orange_600, R.drawable.ic_sword_black_24dp),
    BUY(R.color.green_400, R.drawable.ic_money_black_24dp),
    DEFEND(R.color.indigo_600, R.drawable.ic_shield_black_24dp),
    DISAGREE(R.color.red_600, R.drawable.ic_thumb_down_black_24dp),
    DISCARD(R.color.orange_800, R.drawable.ic_delete_black_24dp),
    DRINK(R.color.blue_600, R.drawable.ic_cup_black_24dp),
    EAT(R.color.brown_600, R.drawable.ic_cookie_black_24dp),
    ENGAGE(R.color.amber_a400, R.drawable.ic_go_black_24dp),
    EXERCISE(R.color.pink_a400, R.drawable.ic_dumbbell_black_24dp),
    FIX(R.color.grey_600, R.drawable.ic_wrench_black_24dp),
    FLEE(R.color.lime_600, R.drawable.ic_run_black_24dp),
    IDEA(R.color.yellow_a700, R.drawable.ic_lightbulb_on_outline_black_24dp),
    INSPECT(R.color.blue_grey_800, R.drawable.ic_eye_black_24dp),
    KEEP(R.color.teal_a400, R.drawable.ic_briefcase_black_24dp),
    LEARN(R.color.green_800, R.drawable.ic_school_black_24dp),
    MOVE_LEFT(R.color.brown_500, R.drawable.ic_arrow_left_black_24dp),
    MOVE_RIGHT(R.color.brown_500, R.drawable.ic_arrow_right_black_24dp),
    NUMERIC_1(R.color.grey_500, R.drawable.ic_numeric_1_black_24dp),
    NUMERIC_2(R.color.grey_500, R.drawable.ic_numeric_2_black_24dp),
    NUMERIC_3(R.color.grey_500, R.drawable.ic_numeric_3_black_24dp),
    PLAY(R.color.purple_a400, R.drawable.ic_play_arrow_black_24dp),
    PROCEED(R.color.green_600, R.drawable.ic_road_black_24dp),
    REST(R.color.blue_900, R.drawable.ic_sleep_black_24dp),
    SELL(R.color.red_400, R.drawable.ic_money_black_24dp),
    STOP(R.color.red_600, R.drawable.ic_no_entry_black_24dp),
    USE(R.color.light_blue_a400, R.drawable.ic_power_plug_black_24dp),
    WAIT(R.color.amber_600, R.drawable.ic_timer_black_24dp);

    private @ColorRes int mColorResId;
    private @DrawableRes int mIconResId;

    ActionType(@ColorRes int colorResId, @DrawableRes int iconResId) {
        mColorResId = colorResId;
        mIconResId = iconResId;
    }

    public @ColorInt int getColor(Context context) {
        return ContextCompat.getColor(context, mColorResId);
    }

    public Bitmap getIcon(Context context) {
        return BitmapUtil.getShortcutIcon(context, getColor(context), mIconResId, Color.WHITE);
    }
}
