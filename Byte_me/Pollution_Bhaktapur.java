package appinventor.ai_riyabzgn9.Byte_me;

import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Canvas;
import com.google.appinventor.components.runtime.CheckBox;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.HorizontalScrollArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
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
import kawa.standard.require;

/* compiled from: Pollution_Bhaktapur.yail */
public class Pollution_Bhaktapur extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Pollution_Bhaktapur").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("VerticalScrollArrangement1").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit12 = IntNum.make(3);
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final IntNum Lit15;
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit17 = IntNum.make(-2);
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final FString Lit19 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final FString Lit20 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit23 = IntNum.make(2);
    static final IntNum Lit24;
    static final IntNum Lit25 = IntNum.make(-1010);
    static final FString Lit26 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit31 = IntNum.make(20);
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit35;
    static final FString Lit36 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit37 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit38 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final FString Lit39 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve());
    static final FString Lit40 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("HorizontalScrollArrangement1").readResolve());
    static final IntNum Lit42 = IntNum.make(30);
    static final FString Lit43 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.CheckBox");
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("CheckBox1").readResolve());
    static final IntNum Lit46 = IntNum.make(-1005);
    static final FString Lit47 = new FString("com.google.appinventor.components.runtime.CheckBox");
    static final FString Lit48 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("Label3").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit51 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("HorizontalScrollArrangement2").readResolve());
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final FString Lit54 = new FString("com.google.appinventor.components.runtime.CheckBox");
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("CheckBox3").readResolve());
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.CheckBox");
    static final FString Lit57 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("Label4").readResolve());
    static final FString Lit59 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final FString Lit60 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("HorizontalScrollArrangement3").readResolve());
    static final FString Lit62 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.CheckBox");
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("CheckBox2").readResolve());
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.CheckBox");
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final IntNum Lit68 = IntNum.make(-1001);
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.Canvas");
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("Canvas1").readResolve());
    static final SimpleSymbol Lit72 = ((SimpleSymbol) new SimpleSymbol("BackgroundImage").readResolve());
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.Canvas");
    static final SimpleSymbol Lit74 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit77 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit83 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit86 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final FString Lit9 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
    public static Pollution_Bhaktapur Pollution_Bhaktapur;
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
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Canvas Canvas1;
    public CheckBox CheckBox1;
    public CheckBox CheckBox2;
    public CheckBox CheckBox3;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalScrollArrangement HorizontalScrollArrangement1;
    public HorizontalScrollArrangement HorizontalScrollArrangement2;
    public HorizontalScrollArrangement HorizontalScrollArrangement3;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public VerticalScrollArrangement VerticalScrollArrangement1;
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
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit35 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -15243610;
        Lit24 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit15 = IntNum.make(iArr3);
    }

    public Pollution_Bhaktapur() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit74, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit75, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit76, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit77, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit78, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit79, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit80, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit81, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit82, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit83, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit84, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit85, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit86, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit87, 8194);
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
        lambda$Fn23 = new ModuleMethod(frame2, 41, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 42, (Object) null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 43, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 44, (Object) null, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 45, (Object) null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 46, (Object) null, 0);
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
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Pollution_Bhaktapur = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find2).run();
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Byte_me", Lit4);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Boolean.TRUE, Lit6);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit7, "Fixed", Lit4);
                    Values.writeValues(C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Pollution_Bhaktapur", Lit4), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.VerticalScrollArrangement1 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit0, Lit9, Lit10, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit19, Lit10, lambda$Fn4);
                }
                this.HorizontalArrangement2 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit10, Lit20, Lit21, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit10, Lit26, Lit21, lambda$Fn6);
                }
                this.Label2 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit21, Lit27, Lit28, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit21, Lit36, Lit28, lambda$Fn8);
                }
                this.Label1 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit10, Lit37, Lit38, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit10, Lit39, Lit38, Boolean.FALSE);
                }
                this.HorizontalScrollArrangement1 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit10, Lit40, Lit41, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit10, Lit43, Lit41, lambda$Fn10);
                }
                this.CheckBox1 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit41, Lit44, Lit45, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit41, Lit47, Lit45, lambda$Fn12);
                }
                this.Label3 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit10, Lit48, Lit49, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit10, Lit50, Lit49, lambda$Fn14);
                }
                this.HorizontalScrollArrangement2 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit10, Lit51, Lit52, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit10, Lit53, Lit52, lambda$Fn16);
                }
                this.CheckBox3 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit52, Lit54, Lit55, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit52, Lit56, Lit55, lambda$Fn18);
                }
                this.Label4 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit10, Lit57, Lit58, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit10, Lit59, Lit58, lambda$Fn20);
                }
                this.HorizontalScrollArrangement3 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit10, Lit60, Lit61, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit10, Lit62, Lit61, lambda$Fn22);
                }
                this.CheckBox2 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit61, Lit63, Lit64, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit61, Lit65, Lit64, lambda$Fn24);
                }
                this.HorizontalArrangement1 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit10, Lit66, Lit67, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit10, Lit69, Lit67, lambda$Fn26);
                }
                this.Canvas1 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit10, Lit70, Lit71, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit10, Lit73, Lit71, lambda$Fn28);
                }
                C0609runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find2);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Byte_me", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Boolean.TRUE, Lit6);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit7, "Fixed", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Pollution_Bhaktapur", Lit4);
    }

    static Object lambda4() {
        C0609runtime.setAndCoerceProperty$Ex(Lit10, Lit11, Lit12, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit10, Lit14, Lit15, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit10, Lit16, Lit17, Lit13);
        return C0609runtime.setAndCoerceProperty$Ex(Lit10, Lit18, Lit17, Lit13);
    }

    static Object lambda5() {
        C0609runtime.setAndCoerceProperty$Ex(Lit10, Lit11, Lit12, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit10, Lit14, Lit15, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit10, Lit16, Lit17, Lit13);
        return C0609runtime.setAndCoerceProperty$Ex(Lit10, Lit18, Lit17, Lit13);
    }

    static Object lambda6() {
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit11, Lit12, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit22, Lit23, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit14, Lit24, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit16, Lit25, Lit13);
        return C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit18, Lit17, Lit13);
    }

    static Object lambda7() {
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit11, Lit12, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit22, Lit23, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit14, Lit24, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit16, Lit25, Lit13);
        return C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit18, Lit17, Lit13);
    }

    static Object lambda8() {
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Boolean.TRUE, Lit6);
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit30, Lit31, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit32, Lit23, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit33, "Did You Know?", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit34, Lit35, Lit13);
    }

    static Object lambda9() {
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Boolean.TRUE, Lit6);
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit30, Lit31, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit32, Lit23, Lit13);
        C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit33, "Did You Know?", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit28, Lit34, Lit35, Lit13);
    }

    static Object lambda10() {
        C0609runtime.setAndCoerceProperty$Ex(Lit41, Lit22, Lit23, Lit13);
        return C0609runtime.setAndCoerceProperty$Ex(Lit41, Lit16, Lit42, Lit13);
    }

    static Object lambda11() {
        C0609runtime.setAndCoerceProperty$Ex(Lit41, Lit22, Lit23, Lit13);
        return C0609runtime.setAndCoerceProperty$Ex(Lit41, Lit16, Lit42, Lit13);
    }

    static Object lambda12() {
        C0609runtime.setAndCoerceProperty$Ex(Lit45, Lit16, Lit46, Lit13);
        return C0609runtime.setAndCoerceProperty$Ex(Lit45, Lit33, "Among Kathmandu, Lalitpur and Bhaktapur;", Lit4);
    }

    static Object lambda13() {
        C0609runtime.setAndCoerceProperty$Ex(Lit45, Lit16, Lit46, Lit13);
        return C0609runtime.setAndCoerceProperty$Ex(Lit45, Lit33, "Among Kathmandu, Lalitpur and Bhaktapur;", Lit4);
    }

    static Object lambda14() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit49, Lit33, "Bhaktapur is the most polluted.", Lit4);
    }

    static Object lambda15() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit49, Lit33, "Bhaktapur is the most polluted.", Lit4);
    }

    static Object lambda16() {
        C0609runtime.setAndCoerceProperty$Ex(Lit52, Lit22, Lit23, Lit13);
        return C0609runtime.setAndCoerceProperty$Ex(Lit52, Lit16, Lit42, Lit13);
    }

    static Object lambda17() {
        C0609runtime.setAndCoerceProperty$Ex(Lit52, Lit22, Lit23, Lit13);
        return C0609runtime.setAndCoerceProperty$Ex(Lit52, Lit16, Lit42, Lit13);
    }

    static Object lambda18() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit55, Lit33, "Nepal’s own emissions bring about less than", Lit4);
    }

    static Object lambda19() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit55, Lit33, "Nepal’s own emissions bring about less than", Lit4);
    }

    static Object lambda20() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit58, Lit33, "0.1% of global emissions.", Lit4);
    }

    static Object lambda21() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit58, Lit33, "0.1% of global emissions.", Lit4);
    }

    static Object lambda22() {
        C0609runtime.setAndCoerceProperty$Ex(Lit61, Lit22, Lit23, Lit13);
        return C0609runtime.setAndCoerceProperty$Ex(Lit61, Lit16, Lit42, Lit13);
    }

    static Object lambda23() {
        C0609runtime.setAndCoerceProperty$Ex(Lit61, Lit22, Lit23, Lit13);
        return C0609runtime.setAndCoerceProperty$Ex(Lit61, Lit16, Lit42, Lit13);
    }

    static Object lambda24() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit64, Lit33, "There are 5.1 million electric cars on road globally.", Lit4);
    }

    static Object lambda25() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit64, Lit33, "There are 5.1 million electric cars on road globally.", Lit4);
    }

    static Object lambda26() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit16, Lit68, Lit13);
    }

    static Object lambda27() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit16, Lit68, Lit13);
    }

    static Object lambda28() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit72, "ScreenShot2020-10-04at11.40.38AM.png", Lit4);
    }

    static Object lambda29() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit71, Lit72, "ScreenShot2020-10-04at11.40.38AM.png", Lit4);
    }

    /* compiled from: Pollution_Bhaktapur.yail */
    public class frame extends ModuleBody {
        Pollution_Bhaktapur $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Pollution_Bhaktapur)) {
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
                    if (!(obj instanceof Pollution_Bhaktapur)) {
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
                    if (!(obj instanceof Pollution_Bhaktapur)) {
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
                    if (!(obj instanceof Pollution_Bhaktapur)) {
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
                    Pollution_Bhaktapur pollution_Bhaktapur = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    pollution_Bhaktapur.dispatchGenericEvent(component, str, z, (Object[]) obj4);
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
                    return Pollution_Bhaktapur.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Pollution_Bhaktapur.lambda3();
                case 21:
                    return Pollution_Bhaktapur.lambda4();
                case 22:
                    return Pollution_Bhaktapur.lambda5();
                case 23:
                    return Pollution_Bhaktapur.lambda6();
                case 24:
                    return Pollution_Bhaktapur.lambda7();
                case 25:
                    return Pollution_Bhaktapur.lambda8();
                case 26:
                    return Pollution_Bhaktapur.lambda9();
                case 27:
                    return Pollution_Bhaktapur.lambda10();
                case 28:
                    return Pollution_Bhaktapur.lambda11();
                case 29:
                    return Pollution_Bhaktapur.lambda12();
                case 30:
                    return Pollution_Bhaktapur.lambda13();
                case 31:
                    return Pollution_Bhaktapur.lambda14();
                case 32:
                    return Pollution_Bhaktapur.lambda15();
                case 33:
                    return Pollution_Bhaktapur.lambda16();
                case 34:
                    return Pollution_Bhaktapur.lambda17();
                case 35:
                    return Pollution_Bhaktapur.lambda18();
                case 36:
                    return Pollution_Bhaktapur.lambda19();
                case 37:
                    return Pollution_Bhaktapur.lambda20();
                case 38:
                    return Pollution_Bhaktapur.lambda21();
                case 39:
                    return Pollution_Bhaktapur.lambda22();
                case 40:
                    return Pollution_Bhaktapur.lambda23();
                case 41:
                    return Pollution_Bhaktapur.lambda24();
                case 42:
                    return Pollution_Bhaktapur.lambda25();
                case 43:
                    return Pollution_Bhaktapur.lambda26();
                case 44:
                    return Pollution_Bhaktapur.lambda27();
                case 45:
                    return Pollution_Bhaktapur.lambda28();
                case 46:
                    return Pollution_Bhaktapur.lambda29();
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
        Pollution_Bhaktapur = this;
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
