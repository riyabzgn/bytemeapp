package appinventor.ai_riyabzgn9.Byte_me;

import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.C0609runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.C0621lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final IntNum Lit100 = IntNum.make(-1015);
    static final IntNum Lit101;
    static final FString Lit102 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit103;
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("Lalitpur$Click").readResolve());
    static final FString Lit105 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement7").readResolve());
    static final IntNum Lit107 = IntNum.make(-1004);
    static final FString Lit108 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit109 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit11 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("Label3").readResolve());
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("FontItalic").readResolve());
    static final FString Lit113 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final SimpleSymbol Lit120 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit122 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit124 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit126 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit127 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit14 = IntNum.make(3);
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final IntNum Lit17;
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit19 = IntNum.make(-2);
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final FString Lit21 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit22 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve());
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit25 = IntNum.make(-1007);
    static final FString Lit26 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("Label4").readResolve());
    static final IntNum Lit29;
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit31 = IntNum.make(20);
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final IntNum Lit33 = IntNum.make(1);
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit36;
    static final FString Lit37 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("TextBox1").readResolve());
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("Hint").readResolve());
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final FString Lit42 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit43 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final IntNum Lit45;
    static final IntNum Lit46;
    static final FString Lit47 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit48 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement8").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("Icon").readResolve());
    static final IntNum Lit50 = IntNum.make(-1002);
    static final FString Lit51 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit52 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit53 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final IntNum Lit54;
    static final IntNum Lit55 = IntNum.make(28);
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("HTMLFormat").readResolve());
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("HasMargins").readResolve());
    static final IntNum Lit58 = IntNum.make(-1013);
    static final IntNum Lit59;
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final IntNum Lit60 = IntNum.make(-1070);
    static final FString Lit61 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit62 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit63 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final IntNum Lit64 = IntNum.make(-1005);
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final IntNum Lit68 = IntNum.make(-1015);
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("Bhaktapur").readResolve());
    static final IntNum Lit72;
    static final IntNum Lit73 = IntNum.make(2);
    static final IntNum Lit74 = IntNum.make(-1015);
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("Shape").readResolve());
    static final IntNum Lit76;
    static final FString Lit77 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit78 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1601827597091_0.6201697250439616-0/youngandroidproject/../src/appinventor/ai_riyabzgn9/Byte_me/Screen1.yail", 651344);
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("Bhaktapur$Click").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit81 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final IntNum Lit83 = IntNum.make(-1015);
    static final FString Lit84 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit86 = ((SimpleSymbol) new SimpleSymbol("Kathmandu").readResolve());
    static final IntNum Lit87;
    static final IntNum Lit88 = IntNum.make(-1015);
    static final IntNum Lit89;
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit91 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1601827597091_0.6201697250439616-0/youngandroidproject/../src/appinventor/ai_riyabzgn9/Byte_me/Screen1.yail", 782416);
    static final SimpleSymbol Lit92 = ((SimpleSymbol) new SimpleSymbol("Kathmandu$Click").readResolve());
    static final FString Lit93 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve());
    static final IntNum Lit95 = IntNum.make(-1015);
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit97 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("Lalitpur").readResolve());
    static final IntNum Lit99;
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Bhaktapur;
    public final ModuleMethod Bhaktapur$Click;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement6;
    public HorizontalArrangement HorizontalArrangement7;
    public HorizontalArrangement HorizontalArrangement8;
    public Button Kathmandu;
    public final ModuleMethod Kathmandu$Click;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public Button Lalitpur;
    public final ModuleMethod Lalitpur$Click;
    public TextBox TextBox1;
    public VerticalArrangement VerticalArrangement1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit103 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1601827597091_0.6201697250439616-0/youngandroidproject/../src/appinventor/ai_riyabzgn9/Byte_me/Screen1.yail", 913487);
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit101 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -16728351;
        Lit99 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit89 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -15439700;
        Lit87 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -1;
        Lit76 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -14270031;
        Lit72 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -1;
        Lit59 = IntNum.make(iArr7);
        int[] iArr8 = new int[2];
        iArr8[0] = -16777216;
        Lit54 = IntNum.make(iArr8);
        int[] iArr9 = new int[2];
        iArr9[0] = -15913870;
        Lit46 = IntNum.make(iArr9);
        int[] iArr10 = new int[2];
        iArr10[0] = -1;
        Lit45 = IntNum.make(iArr10);
        int[] iArr11 = new int[2];
        iArr11[0] = -485807682;
        Lit36 = IntNum.make(iArr11);
        int[] iArr12 = new int[2];
        iArr12[0] = -1;
        Lit29 = IntNum.make(iArr12);
        int[] iArr13 = new int[2];
        iArr13[0] = -1;
        Lit17 = IntNum.make(iArr13);
    }

    public Screen1() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit114, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit115, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit116, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit117, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit118, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit119, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit120, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit121, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit122, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit123, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit124, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit125, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit126, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit127, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime7098639402960890708.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, (Object) null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 22, (Object) null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 23, (Object) null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 24, (Object) null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 25, (Object) null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 26, (Object) null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 27, (Object) null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 28, (Object) null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 29, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 31, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 32, (Object) null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 33, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 34, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 35, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 36, (Object) null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 37, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 39, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 40, (Object) null, 0);
        this.Bhaktapur$Click = new ModuleMethod(frame2, 41, Lit79, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 42, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 43, (Object) null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 44, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 45, (Object) null, 0);
        this.Kathmandu$Click = new ModuleMethod(frame2, 46, Lit92, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 47, (Object) null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 48, (Object) null, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 49, (Object) null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 50, (Object) null, 0);
        this.Lalitpur$Click = new ModuleMethod(frame2, 51, Lit104, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 52, (Object) null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 53, (Object) null, 0);
        lambda$Fn33 = new ModuleMethod(frame2, 54, (Object) null, 0);
        lambda$Fn34 = new ModuleMethod(frame2, 55, (Object) null, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        String obj;
        Consumer $result = $ctx.consumer;
        C0609runtime.$instance.run();
        this.$Stdebug$Mnform$St = Boolean.FALSE;
        this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
        FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
        if (stringAppend == null) {
            obj = null;
        } else {
            obj = stringAppend.toString();
        }
        this.global$Mnvar$Mnenvironment = Environment.make(obj);
        Screen1 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C0609runtime.$instance.run();
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Byte Me", Lit4);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "web_hi_res_512.png", Lit4);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "portrait", Lit4);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit7, Boolean.TRUE, Lit8);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "Fixed", Lit4);
            Values.writeValues(C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "Home Page", Lit4), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn2));
        }
        this.VerticalArrangement1 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit0, Lit11, Lit12, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit21, Lit12, lambda$Fn4);
        }
        this.HorizontalArrangement6 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit12, Lit22, Lit23, lambda$Fn5), $result);
        } else {
            addToComponents(Lit12, Lit26, Lit23, lambda$Fn6);
        }
        this.Label4 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit23, Lit27, Lit28, lambda$Fn7), $result);
        } else {
            addToComponents(Lit23, Lit37, Lit28, lambda$Fn8);
        }
        this.TextBox1 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit23, Lit38, Lit39, lambda$Fn9), $result);
        } else {
            addToComponents(Lit23, Lit42, Lit39, lambda$Fn10);
        }
        this.Label2 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit23, Lit43, Lit44, lambda$Fn11), $result);
        } else {
            addToComponents(Lit23, Lit47, Lit44, lambda$Fn12);
        }
        this.HorizontalArrangement8 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit12, Lit48, Lit49, lambda$Fn13), $result);
        } else {
            addToComponents(Lit12, Lit51, Lit49, lambda$Fn14);
        }
        this.Label1 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit12, Lit52, Lit53, lambda$Fn15), $result);
        } else {
            addToComponents(Lit12, Lit61, Lit53, lambda$Fn16);
        }
        this.HorizontalArrangement5 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit12, Lit62, Lit63, lambda$Fn17), $result);
        } else {
            addToComponents(Lit12, Lit65, Lit63, lambda$Fn18);
        }
        this.HorizontalArrangement2 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit12, Lit66, Lit67, lambda$Fn19), $result);
        } else {
            addToComponents(Lit12, Lit69, Lit67, lambda$Fn20);
        }
        this.Bhaktapur = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit67, Lit70, Lit71, lambda$Fn21), $result);
        } else {
            addToComponents(Lit67, Lit77, Lit71, lambda$Fn22);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit79, this.Bhaktapur$Click);
        } else {
            addToFormEnvironment(Lit79, this.Bhaktapur$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Bhaktapur", "Click");
        } else {
            addToEvents(Lit71, Lit80);
        }
        this.HorizontalArrangement3 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit12, Lit81, Lit82, lambda$Fn23), $result);
        } else {
            addToComponents(Lit12, Lit84, Lit82, lambda$Fn24);
        }
        this.Kathmandu = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit82, Lit85, Lit86, lambda$Fn25), $result);
        } else {
            addToComponents(Lit82, Lit90, Lit86, lambda$Fn26);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit92, this.Kathmandu$Click);
        } else {
            addToFormEnvironment(Lit92, this.Kathmandu$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Kathmandu", "Click");
        } else {
            addToEvents(Lit86, Lit80);
        }
        this.HorizontalArrangement4 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit12, Lit93, Lit94, lambda$Fn27), $result);
        } else {
            addToComponents(Lit12, Lit96, Lit94, lambda$Fn28);
        }
        this.Lalitpur = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit94, Lit97, Lit98, lambda$Fn29), $result);
        } else {
            addToComponents(Lit94, Lit102, Lit98, lambda$Fn30);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit104, this.Lalitpur$Click);
        } else {
            addToFormEnvironment(Lit104, this.Lalitpur$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Lalitpur", "Click");
        } else {
            addToEvents(Lit98, Lit80);
        }
        this.HorizontalArrangement7 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit0, Lit105, Lit106, lambda$Fn31), $result);
        } else {
            addToComponents(Lit0, Lit108, Lit106, lambda$Fn32);
        }
        this.Label3 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit106, Lit109, Lit110, lambda$Fn33), $result);
        } else {
            addToComponents(Lit106, Lit113, Lit110, lambda$Fn34);
        }
        C0609runtime.initRuntime();
    }

    static Object lambda3() {
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Byte Me", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "web_hi_res_512.png", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "portrait", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit7, Boolean.TRUE, Lit8);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "Fixed", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "Home Page", Lit4);
    }

    static Object lambda4() {
        C0609runtime.setAndCoerceProperty$Ex(Lit12, Lit13, Lit14, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit12, Lit16, Lit17, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit12, Lit18, Lit19, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit12, Lit20, Lit19, Lit15);
    }

    static Object lambda5() {
        C0609runtime.setAndCoerceProperty$Ex(Lit12, Lit13, Lit14, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit12, Lit16, Lit17, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit12, Lit18, Lit19, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit12, Lit20, Lit19, Lit15);
    }

    static Object lambda6() {
        C0609runtime.setAndCoerceProperty$Ex(Lit23, Lit13, Lit14, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit23, Lit24, Lit14, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit23, Lit18, Lit25, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit23, Lit20, Lit19, Lit15);
    }

    static Object lambda7() {
        C0609runtime.setAndCoerceProperty$Ex(Lit23, Lit13, Lit14, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit23, Lit24, Lit14, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit23, Lit18, Lit25, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit23, Lit20, Lit19, Lit15);
    }

    static Object lambda8() {
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit16, Lit29, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit30, Lit31, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit32, Lit33, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit34, "Hi", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit35, Lit36, Lit15);
    }

    static Object lambda9() {
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit16, Lit29, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit30, Lit31, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit32, Lit33, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit34, "Hi", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit35, Lit36, Lit15);
    }

    static Object lambda10() {
        C0609runtime.setAndCoerceProperty$Ex(Lit39, Lit30, Lit31, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit39, Lit40, "Your Name", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit39, Lit41, Lit33, Lit15);
    }

    static Object lambda11() {
        C0609runtime.setAndCoerceProperty$Ex(Lit39, Lit30, Lit31, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit39, Lit40, "Your Name", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit39, Lit41, Lit33, Lit15);
    }

    static Object lambda12() {
        C0609runtime.setAndCoerceProperty$Ex(Lit44, Lit16, Lit45, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit44, Lit30, Lit31, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit44, Lit32, Lit33, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit44, Lit34, ",Let's Play!", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit44, Lit41, Lit33, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit44, Lit35, Lit46, Lit15);
    }

    static Object lambda13() {
        C0609runtime.setAndCoerceProperty$Ex(Lit44, Lit16, Lit45, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit44, Lit30, Lit31, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit44, Lit32, Lit33, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit44, Lit34, ",Let's Play!", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit44, Lit41, Lit33, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit44, Lit35, Lit46, Lit15);
    }

    static Object lambda14() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit49, Lit18, Lit50, Lit15);
    }

    static Object lambda15() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit49, Lit18, Lit50, Lit15);
    }

    static Object lambda16() {
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit16, Lit54, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit30, Lit55, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit32, Lit14, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit56, Boolean.TRUE, Lit8);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit57, Boolean.FALSE, Lit8);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit18, Lit58, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit34, "Choose A Location:", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit41, Lit33, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit35, Lit59, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit20, Lit60, Lit15);
    }

    static Object lambda17() {
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit16, Lit54, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit30, Lit55, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit32, Lit14, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit56, Boolean.TRUE, Lit8);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit57, Boolean.FALSE, Lit8);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit18, Lit58, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit34, "Choose A Location:", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit41, Lit33, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit35, Lit59, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit20, Lit60, Lit15);
    }

    static Object lambda18() {
        C0609runtime.setAndCoerceProperty$Ex(Lit63, Lit18, Lit64, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit63, Lit20, Lit19, Lit15);
    }

    static Object lambda19() {
        C0609runtime.setAndCoerceProperty$Ex(Lit63, Lit18, Lit64, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit63, Lit20, Lit19, Lit15);
    }

    static Object lambda20() {
        C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit18, Lit68, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit20, Lit19, Lit15);
    }

    static Object lambda21() {
        C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit18, Lit68, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit20, Lit19, Lit15);
    }

    static Object lambda22() {
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit16, Lit72, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit30, Lit31, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit32, Lit73, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit18, Lit74, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit75, Lit73, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit34, "Bhaktapur, Nepal", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit35, Lit76, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit20, Lit19, Lit15);
    }

    static Object lambda23() {
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit16, Lit72, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit30, Lit31, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit32, Lit73, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit18, Lit74, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit75, Lit73, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit34, "Bhaktapur, Nepal", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit35, Lit76, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit20, Lit19, Lit15);
    }

    public Object Bhaktapur$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.callYailPrimitive(C0609runtime.open$Mnanother$Mnscreen, LList.list1("Bhaktapur"), Lit78, "open another screen");
    }

    static Object lambda24() {
        C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit18, Lit83, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit20, Lit19, Lit15);
    }

    static Object lambda25() {
        C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit18, Lit83, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit20, Lit19, Lit15);
    }

    static Object lambda26() {
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit16, Lit87, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit30, Lit31, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit32, Lit73, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit18, Lit88, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit75, Lit73, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit34, "Kathmandu, Nepal", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit35, Lit89, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit20, Lit19, Lit15);
    }

    static Object lambda27() {
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit16, Lit87, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit30, Lit31, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit32, Lit73, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit18, Lit88, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit75, Lit73, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit34, "Kathmandu, Nepal", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit35, Lit89, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit86, Lit20, Lit19, Lit15);
    }

    public Object Kathmandu$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.callYailPrimitive(C0609runtime.open$Mnanother$Mnscreen, LList.list1("Kathmandu"), Lit91, "open another screen");
    }

    static Object lambda28() {
        C0609runtime.setAndCoerceProperty$Ex(Lit94, Lit18, Lit95, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit94, Lit20, Lit19, Lit15);
    }

    static Object lambda29() {
        C0609runtime.setAndCoerceProperty$Ex(Lit94, Lit18, Lit95, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit94, Lit20, Lit19, Lit15);
    }

    static Object lambda30() {
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit16, Lit99, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit30, Lit31, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit32, Lit73, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit18, Lit100, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit75, Lit73, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit34, "Global", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit35, Lit101, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit20, Lit19, Lit15);
    }

    static Object lambda31() {
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit16, Lit99, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit30, Lit31, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit32, Lit73, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit18, Lit100, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit75, Lit73, Lit15);
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit34, "Global", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit35, Lit101, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit98, Lit20, Lit19, Lit15);
    }

    public Object Lalitpur$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.callYailPrimitive(C0609runtime.open$Mnanother$Mnscreen, LList.list1("Lalitpur"), Lit103, "open another screen");
    }

    static Object lambda32() {
        C0609runtime.setAndCoerceProperty$Ex(Lit106, Lit24, Lit14, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit106, Lit18, Lit107, Lit15);
    }

    static Object lambda33() {
        C0609runtime.setAndCoerceProperty$Ex(Lit106, Lit24, Lit14, Lit15);
        return C0609runtime.setAndCoerceProperty$Ex(Lit106, Lit18, Lit107, Lit15);
    }

    static Object lambda34() {
        C0609runtime.setAndCoerceProperty$Ex(Lit110, Lit111, Boolean.TRUE, Lit8);
        C0609runtime.setAndCoerceProperty$Ex(Lit110, Lit112, Boolean.TRUE, Lit8);
        return C0609runtime.setAndCoerceProperty$Ex(Lit110, Lit34, "By Byte Me.", Lit4);
    }

    static Object lambda35() {
        C0609runtime.setAndCoerceProperty$Ex(Lit110, Lit111, Boolean.TRUE, Lit8);
        C0609runtime.setAndCoerceProperty$Ex(Lit110, Lit112, Boolean.TRUE, Lit8);
        return C0609runtime.setAndCoerceProperty$Ex(Lit110, Lit34, "By Byte Me.", Lit4);
    }

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 14:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 4;
                    return 0;
                case 15:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 3:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "is-bound-in-form-environment", 1, obj);
                    }
                case 12:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 13:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 14:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            boolean z = true;
            switch (moduleMethod.selector) {
                case 10:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 16:
                    Screen1 screen1 = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    screen1.dispatchGenericEvent(component, str, z, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 4:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 8:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 9:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 11:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Screen1.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Screen1.lambda3();
                case 21:
                    return Screen1.lambda4();
                case 22:
                    return Screen1.lambda5();
                case 23:
                    return Screen1.lambda6();
                case 24:
                    return Screen1.lambda7();
                case 25:
                    return Screen1.lambda8();
                case 26:
                    return Screen1.lambda9();
                case 27:
                    return Screen1.lambda10();
                case 28:
                    return Screen1.lambda11();
                case 29:
                    return Screen1.lambda12();
                case 30:
                    return Screen1.lambda13();
                case 31:
                    return Screen1.lambda14();
                case 32:
                    return Screen1.lambda15();
                case 33:
                    return Screen1.lambda16();
                case 34:
                    return Screen1.lambda17();
                case 35:
                    return Screen1.lambda18();
                case 36:
                    return Screen1.lambda19();
                case 37:
                    return Screen1.lambda20();
                case 38:
                    return Screen1.lambda21();
                case 39:
                    return Screen1.lambda22();
                case 40:
                    return Screen1.lambda23();
                case 41:
                    return this.$main.Bhaktapur$Click();
                case 42:
                    return Screen1.lambda24();
                case 43:
                    return Screen1.lambda25();
                case 44:
                    return Screen1.lambda26();
                case 45:
                    return Screen1.lambda27();
                case 46:
                    return this.$main.Kathmandu$Click();
                case 47:
                    return Screen1.lambda28();
                case 48:
                    return Screen1.lambda29();
                case 49:
                    return Screen1.lambda30();
                case 50:
                    return Screen1.lambda31();
                case 51:
                    return this.$main.Lalitpur$Click();
                case 52:
                    return Screen1.lambda32();
                case 53:
                    return Screen1.lambda33();
                case 54:
                    return Screen1.lambda34();
                case 55:
                    return Screen1.lambda35();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(true);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = C0621lists.cons(C0621lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = C0621lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = C0621lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = C0621lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        Boolean bool;
        boolean x = true;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                apply.apply2(handler, C0621lists.cons(componentObject, C0621lists.cons(bool, LList.makeList(args, 0))));
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this != componentObject) {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Object reverse;
        Object obj;
        Object reverse2;
        Object obj2;
        Object obj3;
        Object var;
        Object component$Mnname;
        Object obj4;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj5 = this.events$Mnto$Mnregister;
        while (obj5 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj5;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = C0621lists.car.apply1(event$Mninfo);
                String obj6 = apply1 == null ? null : apply1.toString();
                Object apply12 = C0621lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj6, apply12 == null ? null : apply12.toString());
                obj5 = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj5);
            }
        }
        try {
            LList components = C0621lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            reverse = C0621lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse != LList.Empty) {
                Pair arg02 = (Pair) reverse;
                misc.force(arg02.getCar());
                reverse = arg02.getCdr();
            }
            obj = components;
            while (obj != LList.Empty) {
                Pair arg03 = (Pair) obj;
                Object component$Mninfo = arg03.getCar();
                component$Mnname = C0621lists.caddr.apply1(component$Mninfo);
                C0621lists.cadddr.apply1(component$Mninfo);
                Object component$Mnobject = Invoke.make.apply2(C0621lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) C0621lists.car.apply1(component$Mninfo)));
                SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                obj = arg03.getCdr();
            }
            reverse2 = C0621lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse2 != LList.Empty) {
                Pair arg04 = (Pair) reverse2;
                Object var$Mnval = arg04.getCar();
                var = C0621lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(C0621lists.cadr.apply1(var$Mnval)));
                reverse2 = arg04.getCdr();
            }
            LList component$Mndescriptors = components;
            obj2 = component$Mndescriptors;
            while (obj2 != LList.Empty) {
                Pair arg05 = (Pair) obj2;
                Object component$Mninfo2 = arg05.getCar();
                C0621lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = C0621lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                obj2 = arg05.getCdr();
            }
            obj3 = component$Mndescriptors;
            while (obj3 != LList.Empty) {
                Pair arg06 = (Pair) obj3;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = C0621lists.caddr.apply1(component$Mninfo3);
                C0621lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                obj3 = arg06.getCdr();
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "arg0", -2, obj3);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "arg0", -2, obj2);
        } catch (ClassCastException e4) {
            throw new WrongType(e4, "add-to-global-var-environment", 0, var);
        } catch (ClassCastException e5) {
            throw new WrongType(e5, "arg0", -2, reverse2);
        } catch (ClassCastException e6) {
            throw new WrongType(e6, "add-to-form-environment", 0, component$Mnname);
        } catch (ClassCastException e7) {
            throw new WrongType(e7, "lookup-in-form-environment", 0, obj4);
        } catch (ClassCastException e8) {
            throw new WrongType(e8, "arg0", -2, obj);
        } catch (ClassCastException e9) {
            throw new WrongType(e9, "arg0", -2, reverse);
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        LList lList = symbols;
        while (lList != LList.Empty) {
            try {
                Pair arg0 = (Pair) lList;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    lList = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, lList);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, apply2);
        }
    }

    static Object lambda2() {
        return null;
    }
}
