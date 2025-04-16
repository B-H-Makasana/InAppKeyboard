-keepattributes *Annotation*, Signature

-keep class quipment.qristal.inAppKeyboard.* {
    public <methods>;
    protected <methods>;
    public static <methods>;
    public <init>(...);
}
-keep class com.customKeyboard.inAppKeyboard.data.keyboardAction.KeyboardController
-keep class com.customKeyboard.inAppKeyboard.ui.keyboard.InAppKeyboardViewKt

-keepclassmembers class com.customKeyboard.inAppKeyboard.data.keyboardAction.KeyboardController{
 <methods>;
  <fields>;
}
-keepclassmembers class com.customKeyboard.inAppKeyboard.data.keyboardAction.KeyboardType{
 <methods>;
  <fields>;
}