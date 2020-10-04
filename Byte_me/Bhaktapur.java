package appinventor.ai_riyabzgn9.Byte_me;

import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.ComponentConstants;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TableArrangement;
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

/* compiled from: Bhaktapur.yail */
public class Bhaktapur extends Form implements Runnable {
    public static Bhaktapur Bhaktapur;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Bhaktapur").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final FString Lit10 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
    static final IntNum Lit100;
    static final IntNum Lit101;
    static final FString Lit102 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit103 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("TableArrangement3").readResolve());
    static final FString Lit105 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final FString Lit106 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("correct_ans3").readResolve());
    static final IntNum Lit108;
    static final IntNum Lit109;
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("VerticalScrollArrangement1").readResolve());
    static final IntNum Lit110 = IntNum.make(-1025);
    static final FString Lit111 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit112 = IntNum.make(-16751104);
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("correct_ans3$Click").readResolve());
    static final FString Lit114 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("Button9").readResolve());
    static final IntNum Lit116;
    static final IntNum Lit117;
    static final IntNum Lit118 = IntNum.make(-1025);
    static final FString Lit119 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit120 = IntNum.make(-39322);
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("Button9$Click").readResolve());
    static final FString Lit122 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("Button12").readResolve());
    static final IntNum Lit124;
    static final IntNum Lit125;
    static final FString Lit126 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit127 = IntNum.make(-39322);
    static final SimpleSymbol Lit128 = ((SimpleSymbol) new SimpleSymbol("Button12$Click").readResolve());
    static final FString Lit129 = new FString("com.google.appinventor.components.runtime.Label");
    static final IntNum Lit13 = IntNum.make(3);
    static final SimpleSymbol Lit130 = ((SimpleSymbol) new SimpleSymbol("Label13").readResolve());
    static final FString Lit131 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit132 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit133 = ((SimpleSymbol) new SimpleSymbol("Label14").readResolve());
    static final FString Lit134 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit135 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit136 = ((SimpleSymbol) new SimpleSymbol("Label15").readResolve());
    static final FString Lit137 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit138 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit139 = ((SimpleSymbol) new SimpleSymbol("Label16").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final FString Lit140 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit141 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit142 = ((SimpleSymbol) new SimpleSymbol("Button11").readResolve());
    static final IntNum Lit143;
    static final IntNum Lit144;
    static final IntNum Lit145 = IntNum.make(30);
    static final FString Lit146 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit147 = IntNum.make(-39322);
    static final SimpleSymbol Lit148 = ((SimpleSymbol) new SimpleSymbol("Button11$Click").readResolve());
    static final FString Lit149 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final SimpleSymbol Lit150 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final IntNum Lit151 = IntNum.make(-1001);
    static final FString Lit152 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit153 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit154 = ((SimpleSymbol) new SimpleSymbol("Label4").readResolve());
    static final IntNum Lit155;
    static final IntNum Lit156;
    static final FString Lit157 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit158 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final SimpleSymbol Lit159 = ((SimpleSymbol) new SimpleSymbol("TableArrangement6").readResolve());
    static final IntNum Lit16;
    static final FString Lit160 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final FString Lit161 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit162 = ((SimpleSymbol) new SimpleSymbol("Label22").readResolve());
    static final FString Lit163 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit164 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit165 = ((SimpleSymbol) new SimpleSymbol("Label23").readResolve());
    static final FString Lit166 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit167 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit168 = ((SimpleSymbol) new SimpleSymbol("Button17").readResolve());
    static final IntNum Lit169;
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit170;
    static final IntNum Lit171 = IntNum.make(110);
    static final FString Lit172 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit173 = IntNum.make(-39322);
    static final SimpleSymbol Lit174 = ((SimpleSymbol) new SimpleSymbol("Button17$Click").readResolve());
    static final FString Lit175 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit176 = ((SimpleSymbol) new SimpleSymbol("correct5").readResolve());
    static final IntNum Lit177;
    static final IntNum Lit178;
    static final FString Lit179 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit18 = IntNum.make(-2);
    static final IntNum Lit180 = IntNum.make(-16751104);
    static final SimpleSymbol Lit181 = ((SimpleSymbol) new SimpleSymbol("correct5$Click").readResolve());
    static final FString Lit182 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit183 = ((SimpleSymbol) new SimpleSymbol("Button19").readResolve());
    static final IntNum Lit184;
    static final IntNum Lit185;
    static final FString Lit186 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit187 = IntNum.make(-39322);
    static final SimpleSymbol Lit188 = ((SimpleSymbol) new SimpleSymbol("Button19$Click").readResolve());
    static final FString Lit189 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final SimpleSymbol Lit190 = ((SimpleSymbol) new SimpleSymbol("Button20").readResolve());
    static final IntNum Lit191;
    static final IntNum Lit192;
    static final FString Lit193 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit194 = IntNum.make(-39322);
    static final SimpleSymbol Lit195 = ((SimpleSymbol) new SimpleSymbol("Button20$Click").readResolve());
    static final FString Lit196 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit197 = ((SimpleSymbol) new SimpleSymbol("Label24").readResolve());
    static final FString Lit198 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit199 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final FString Lit20 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
    static final SimpleSymbol Lit200 = ((SimpleSymbol) new SimpleSymbol("Label25").readResolve());
    static final FString Lit201 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit202 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit203 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement14").readResolve());
    static final IntNum Lit204 = IntNum.make(-1001);
    static final FString Lit205 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit206 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit207 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement7").readResolve());
    static final FString Lit208 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit209 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit21 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit210 = ((SimpleSymbol) new SimpleSymbol("Label21").readResolve());
    static final IntNum Lit211;
    static final IntNum Lit212;
    static final FString Lit213 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit214 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final SimpleSymbol Lit215 = ((SimpleSymbol) new SimpleSymbol("TableArrangement7").readResolve());
    static final FString Lit216 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final FString Lit217 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit218 = ((SimpleSymbol) new SimpleSymbol("Label27").readResolve());
    static final FString Lit219 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement17").readResolve());
    static final FString Lit220 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit221 = ((SimpleSymbol) new SimpleSymbol("Label28").readResolve());
    static final FString Lit222 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit223 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit224 = ((SimpleSymbol) new SimpleSymbol("Button21").readResolve());
    static final IntNum Lit225;
    static final IntNum Lit226;
    static final FString Lit227 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit228 = IntNum.make(-39322);
    static final SimpleSymbol Lit229 = ((SimpleSymbol) new SimpleSymbol("Button21$Click").readResolve());
    static final FString Lit23 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit230 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit231 = ((SimpleSymbol) new SimpleSymbol("correct8").readResolve());
    static final IntNum Lit232;
    static final IntNum Lit233;
    static final FString Lit234 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit235 = IntNum.make(-16751104);
    static final SimpleSymbol Lit236 = ((SimpleSymbol) new SimpleSymbol("correct8$Click").readResolve());
    static final FString Lit237 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit238 = ((SimpleSymbol) new SimpleSymbol("Button23").readResolve());
    static final IntNum Lit239;
    static final FString Lit24 = new FString("com.google.appinventor.components.runtime.Label");
    static final IntNum Lit240;
    static final FString Lit241 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit242 = IntNum.make(-39322);
    static final SimpleSymbol Lit243 = ((SimpleSymbol) new SimpleSymbol("Button23$Click").readResolve());
    static final FString Lit244 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit245 = ((SimpleSymbol) new SimpleSymbol("Button24").readResolve());
    static final IntNum Lit246;
    static final IntNum Lit247;
    static final FString Lit248 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit249 = IntNum.make(-39322);
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("Label42").readResolve());
    static final SimpleSymbol Lit250 = ((SimpleSymbol) new SimpleSymbol("Button24$Click").readResolve());
    static final FString Lit251 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit252 = ((SimpleSymbol) new SimpleSymbol("Label29").readResolve());
    static final FString Lit253 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit254 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit255 = ((SimpleSymbol) new SimpleSymbol("Label30").readResolve());
    static final FString Lit256 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit257 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit258 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement15").readResolve());
    static final IntNum Lit259 = IntNum.make(-1001);
    static final IntNum Lit26;
    static final FString Lit260 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit261 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit262 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement16").readResolve());
    static final FString Lit263 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit264 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit265 = ((SimpleSymbol) new SimpleSymbol("Label41").readResolve());
    static final IntNum Lit266;
    static final IntNum Lit267;
    static final FString Lit268 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit269 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final SimpleSymbol Lit27 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit270 = ((SimpleSymbol) new SimpleSymbol("TableArrangement5").readResolve());
    static final FString Lit271 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final FString Lit272 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit273 = ((SimpleSymbol) new SimpleSymbol("Button14").readResolve());
    static final IntNum Lit274;
    static final IntNum Lit275;
    static final FString Lit276 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit277 = IntNum.make(-39322);
    static final SimpleSymbol Lit278 = ((SimpleSymbol) new SimpleSymbol("Button14$Click").readResolve());
    static final FString Lit279 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final SimpleSymbol Lit280 = ((SimpleSymbol) new SimpleSymbol("Button16").readResolve());
    static final IntNum Lit281;
    static final IntNum Lit282;
    static final FString Lit283 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit284 = IntNum.make(-39322);
    static final SimpleSymbol Lit285 = ((SimpleSymbol) new SimpleSymbol("Button16$Click").readResolve());
    static final FString Lit286 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit287 = ((SimpleSymbol) new SimpleSymbol("Button13").readResolve());
    static final IntNum Lit288;
    static final IntNum Lit289;
    static final IntNum Lit29;
    static final IntNum Lit290 = IntNum.make(-1010);
    static final FString Lit291 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit292 = IntNum.make(-39322);
    static final SimpleSymbol Lit293 = ((SimpleSymbol) new SimpleSymbol("Button13$Click").readResolve());
    static final FString Lit294 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit295 = ((SimpleSymbol) new SimpleSymbol("correct_ans4").readResolve());
    static final IntNum Lit296;
    static final IntNum Lit297;
    static final FString Lit298 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit299 = IntNum.make(-16751104);
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final FString Lit30 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit300 = ((SimpleSymbol) new SimpleSymbol("correct_ans4$Click").readResolve());
    static final FString Lit301 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit302 = ((SimpleSymbol) new SimpleSymbol("Label17").readResolve());
    static final FString Lit303 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit304 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit305 = ((SimpleSymbol) new SimpleSymbol("Label18").readResolve());
    static final FString Lit306 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit307 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit308 = ((SimpleSymbol) new SimpleSymbol("Label19").readResolve());
    static final FString Lit309 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit31 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final FString Lit310 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit311 = ((SimpleSymbol) new SimpleSymbol("Label20").readResolve());
    static final FString Lit312 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit313 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit314 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement18").readResolve());
    static final IntNum Lit315 = IntNum.make(-1001);
    static final FString Lit316 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit317 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit318 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final SimpleSymbol Lit319 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("TableArrangement1").readResolve());
    static final IntNum Lit320;
    static final IntNum Lit321 = IntNum.make(-1100);
    static final FString Lit322 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit323 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit324 = ((SimpleSymbol) new SimpleSymbol("submit").readResolve());
    static final IntNum Lit325;
    static final IntNum Lit326 = IntNum.make(15);
    static final IntNum Lit327;
    static final FString Lit328 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit329;
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("Columns").readResolve());
    static final SimpleSymbol Lit330 = ((SimpleSymbol) new SimpleSymbol("submit$Click").readResolve());
    static final FString Lit331 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit332 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final IntNum Lit333 = IntNum.make(16777215);
    static final IntNum Lit334 = IntNum.make(-1008);
    static final SimpleSymbol Lit335 = ((SimpleSymbol) new SimpleSymbol("Image").readResolve());
    static final SimpleSymbol Lit336 = ((SimpleSymbol) new SimpleSymbol("Visible").readResolve());
    static final FString Lit337 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit338 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit339 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final IntNum Lit34 = IntNum.make(4);
    static final SimpleSymbol Lit340 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit341 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit342 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit343 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit344 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit345 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit346 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit347 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit348 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit349 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final FString Lit35 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final SimpleSymbol Lit350 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit351 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final FString Lit36 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("correct_ans").readResolve());
    static final IntNum Lit38;
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("Column").readResolve());
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("Row").readResolve());
    static final IntNum Lit41 = IntNum.make(0);
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("Shape").readResolve());
    static final IntNum Lit43 = IntNum.make(2);
    static final IntNum Lit44;
    static final IntNum Lit45 = IntNum.make(-1025);
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit47 = IntNum.make(-16751104);
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("correct_ans$Click").readResolve());
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("Button4").readResolve());
    static final IntNum Lit52;
    static final IntNum Lit53 = IntNum.make(1);
    static final IntNum Lit54;
    static final FString Lit55 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit56 = IntNum.make(-39322);
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("Button4$Click").readResolve());
    static final FString Lit58 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final IntNum Lit60;
    static final IntNum Lit61;
    static final IntNum Lit62 = IntNum.make(-1025);
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit64 = IntNum.make(-39322);
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("Label5").readResolve());
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final IntNum Lit70 = IntNum.make(20);
    static final FString Lit71 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit72 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit73 = ((SimpleSymbol) new SimpleSymbol("Label6").readResolve());
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("Label7").readResolve());
    static final FString Lit77 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("Label8").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final FString Lit80 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit81 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("Button3").readResolve());
    static final IntNum Lit83;
    static final IntNum Lit84;
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit86 = IntNum.make(-39322);
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("Button3$Click").readResolve());
    static final FString Lit88 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve());
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final IntNum Lit90 = IntNum.make(-1001);
    static final FString Lit91 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("Label3").readResolve());
    static final IntNum Lit94;
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit96;
    static final FString Lit97 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("Label43").readResolve());
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn100 = null;
    static final ModuleMethod lambda$Fn101 = null;
    static final ModuleMethod lambda$Fn102 = null;
    static final ModuleMethod lambda$Fn103 = null;
    static final ModuleMethod lambda$Fn104 = null;
    static final ModuleMethod lambda$Fn105 = null;
    static final ModuleMethod lambda$Fn106 = null;
    static final ModuleMethod lambda$Fn107 = null;
    static final ModuleMethod lambda$Fn108 = null;
    static final ModuleMethod lambda$Fn109 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn110 = null;
    static final ModuleMethod lambda$Fn111 = null;
    static final ModuleMethod lambda$Fn112 = null;
    static final ModuleMethod lambda$Fn113 = null;
    static final ModuleMethod lambda$Fn114 = null;
    static final ModuleMethod lambda$Fn115 = null;
    static final ModuleMethod lambda$Fn116 = null;
    static final ModuleMethod lambda$Fn117 = null;
    static final ModuleMethod lambda$Fn118 = null;
    static final ModuleMethod lambda$Fn119 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn120 = null;
    static final ModuleMethod lambda$Fn121 = null;
    static final ModuleMethod lambda$Fn122 = null;
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
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn43 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn45 = null;
    static final ModuleMethod lambda$Fn46 = null;
    static final ModuleMethod lambda$Fn47 = null;
    static final ModuleMethod lambda$Fn48 = null;
    static final ModuleMethod lambda$Fn49 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn50 = null;
    static final ModuleMethod lambda$Fn51 = null;
    static final ModuleMethod lambda$Fn52 = null;
    static final ModuleMethod lambda$Fn53 = null;
    static final ModuleMethod lambda$Fn54 = null;
    static final ModuleMethod lambda$Fn55 = null;
    static final ModuleMethod lambda$Fn56 = null;
    static final ModuleMethod lambda$Fn57 = null;
    static final ModuleMethod lambda$Fn58 = null;
    static final ModuleMethod lambda$Fn59 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn60 = null;
    static final ModuleMethod lambda$Fn61 = null;
    static final ModuleMethod lambda$Fn62 = null;
    static final ModuleMethod lambda$Fn63 = null;
    static final ModuleMethod lambda$Fn64 = null;
    static final ModuleMethod lambda$Fn65 = null;
    static final ModuleMethod lambda$Fn66 = null;
    static final ModuleMethod lambda$Fn67 = null;
    static final ModuleMethod lambda$Fn68 = null;
    static final ModuleMethod lambda$Fn69 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn70 = null;
    static final ModuleMethod lambda$Fn71 = null;
    static final ModuleMethod lambda$Fn72 = null;
    static final ModuleMethod lambda$Fn73 = null;
    static final ModuleMethod lambda$Fn74 = null;
    static final ModuleMethod lambda$Fn75 = null;
    static final ModuleMethod lambda$Fn76 = null;
    static final ModuleMethod lambda$Fn77 = null;
    static final ModuleMethod lambda$Fn78 = null;
    static final ModuleMethod lambda$Fn79 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn80 = null;
    static final ModuleMethod lambda$Fn81 = null;
    static final ModuleMethod lambda$Fn82 = null;
    static final ModuleMethod lambda$Fn83 = null;
    static final ModuleMethod lambda$Fn84 = null;
    static final ModuleMethod lambda$Fn85 = null;
    static final ModuleMethod lambda$Fn86 = null;
    static final ModuleMethod lambda$Fn87 = null;
    static final ModuleMethod lambda$Fn88 = null;
    static final ModuleMethod lambda$Fn89 = null;
    static final ModuleMethod lambda$Fn9 = null;
    static final ModuleMethod lambda$Fn90 = null;
    static final ModuleMethod lambda$Fn91 = null;
    static final ModuleMethod lambda$Fn92 = null;
    static final ModuleMethod lambda$Fn93 = null;
    static final ModuleMethod lambda$Fn94 = null;
    static final ModuleMethod lambda$Fn95 = null;
    static final ModuleMethod lambda$Fn96 = null;
    static final ModuleMethod lambda$Fn97 = null;
    static final ModuleMethod lambda$Fn98 = null;
    static final ModuleMethod lambda$Fn99 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public Button Button11;
    public final ModuleMethod Button11$Click;
    public Button Button12;
    public final ModuleMethod Button12$Click;
    public Button Button13;
    public final ModuleMethod Button13$Click;
    public Button Button14;
    public final ModuleMethod Button14$Click;
    public Button Button16;
    public final ModuleMethod Button16$Click;
    public Button Button17;
    public final ModuleMethod Button17$Click;
    public Button Button19;
    public final ModuleMethod Button19$Click;
    public Button Button20;
    public final ModuleMethod Button20$Click;
    public Button Button21;
    public final ModuleMethod Button21$Click;
    public Button Button23;
    public final ModuleMethod Button23$Click;
    public Button Button24;
    public final ModuleMethod Button24$Click;
    public Button Button3;
    public final ModuleMethod Button3$Click;
    public Button Button4;
    public final ModuleMethod Button4$Click;
    public Button Button9;
    public final ModuleMethod Button9$Click;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement14;
    public HorizontalArrangement HorizontalArrangement15;
    public HorizontalArrangement HorizontalArrangement16;
    public HorizontalArrangement HorizontalArrangement17;
    public HorizontalArrangement HorizontalArrangement18;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement7;
    public Label Label13;
    public Label Label14;
    public Label Label15;
    public Label Label16;
    public Label Label17;
    public Label Label18;
    public Label Label19;
    public Label Label20;
    public Label Label21;
    public Label Label22;
    public Label Label23;
    public Label Label24;
    public Label Label25;
    public Label Label27;
    public Label Label28;
    public Label Label29;
    public Label Label3;
    public Label Label30;
    public Label Label4;
    public Label Label41;
    public Label Label42;
    public Label Label43;
    public Label Label5;
    public Label Label6;
    public Label Label7;
    public Label Label8;
    public TableArrangement TableArrangement1;
    public TableArrangement TableArrangement3;
    public TableArrangement TableArrangement5;
    public TableArrangement TableArrangement6;
    public TableArrangement TableArrangement7;
    public VerticalScrollArrangement VerticalScrollArrangement1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public Button correct5;
    public final ModuleMethod correct5$Click;
    public Button correct8;
    public final ModuleMethod correct8$Click;
    public Button correct_ans;
    public final ModuleMethod correct_ans$Click;
    public Button correct_ans3;
    public final ModuleMethod correct_ans3$Click;
    public Button correct_ans4;
    public final ModuleMethod correct_ans4$Click;
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
    public Button submit;
    public final ModuleMethod submit$Click;

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit329 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1601827597091_0.6201697250439616-0/youngandroidproject/../src/appinventor/ai_riyabzgn9/Byte_me/Bhaktapur.yail", 3637338);
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit327 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -4009239;
        Lit325 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -9861163;
        Lit320 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -1;
        Lit297 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -4009239;
        Lit296 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -1;
        Lit289 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -4009239;
        Lit288 = IntNum.make(iArr7);
        int[] iArr8 = new int[2];
        iArr8[0] = -1;
        Lit282 = IntNum.make(iArr8);
        int[] iArr9 = new int[2];
        iArr9[0] = -4009239;
        Lit281 = IntNum.make(iArr9);
        int[] iArr10 = new int[2];
        iArr10[0] = -1;
        Lit275 = IntNum.make(iArr10);
        int[] iArr11 = new int[2];
        iArr11[0] = -4009239;
        Lit274 = IntNum.make(iArr11);
        int[] iArr12 = new int[2];
        iArr12[0] = -1;
        Lit267 = IntNum.make(iArr12);
        int[] iArr13 = new int[2];
        iArr13[0] = -9861163;
        Lit266 = IntNum.make(iArr13);
        int[] iArr14 = new int[2];
        iArr14[0] = -1;
        Lit247 = IntNum.make(iArr14);
        int[] iArr15 = new int[2];
        iArr15[0] = -4009239;
        Lit246 = IntNum.make(iArr15);
        int[] iArr16 = new int[2];
        iArr16[0] = -1;
        Lit240 = IntNum.make(iArr16);
        int[] iArr17 = new int[2];
        iArr17[0] = -4009239;
        Lit239 = IntNum.make(iArr17);
        int[] iArr18 = new int[2];
        iArr18[0] = -1;
        Lit233 = IntNum.make(iArr18);
        int[] iArr19 = new int[2];
        iArr19[0] = -4009239;
        Lit232 = IntNum.make(iArr19);
        int[] iArr20 = new int[2];
        iArr20[0] = -1;
        Lit226 = IntNum.make(iArr20);
        int[] iArr21 = new int[2];
        iArr21[0] = -4009239;
        Lit225 = IntNum.make(iArr21);
        int[] iArr22 = new int[2];
        iArr22[0] = -1;
        Lit212 = IntNum.make(iArr22);
        int[] iArr23 = new int[2];
        iArr23[0] = -9861163;
        Lit211 = IntNum.make(iArr23);
        int[] iArr24 = new int[2];
        iArr24[0] = -1;
        Lit192 = IntNum.make(iArr24);
        int[] iArr25 = new int[2];
        iArr25[0] = -4009239;
        Lit191 = IntNum.make(iArr25);
        int[] iArr26 = new int[2];
        iArr26[0] = -1;
        Lit185 = IntNum.make(iArr26);
        int[] iArr27 = new int[2];
        iArr27[0] = -4009239;
        Lit184 = IntNum.make(iArr27);
        int[] iArr28 = new int[2];
        iArr28[0] = -1;
        Lit178 = IntNum.make(iArr28);
        int[] iArr29 = new int[2];
        iArr29[0] = -4009239;
        Lit177 = IntNum.make(iArr29);
        int[] iArr30 = new int[2];
        iArr30[0] = -1;
        Lit170 = IntNum.make(iArr30);
        int[] iArr31 = new int[2];
        iArr31[0] = -4009239;
        Lit169 = IntNum.make(iArr31);
        int[] iArr32 = new int[2];
        iArr32[0] = -1;
        Lit156 = IntNum.make(iArr32);
        int[] iArr33 = new int[2];
        iArr33[0] = -9861163;
        Lit155 = IntNum.make(iArr33);
        int[] iArr34 = new int[2];
        iArr34[0] = -1;
        Lit144 = IntNum.make(iArr34);
        int[] iArr35 = new int[2];
        iArr35[0] = -4009239;
        Lit143 = IntNum.make(iArr35);
        int[] iArr36 = new int[2];
        iArr36[0] = -1;
        Lit125 = IntNum.make(iArr36);
        int[] iArr37 = new int[2];
        iArr37[0] = -4009239;
        Lit124 = IntNum.make(iArr37);
        int[] iArr38 = new int[2];
        iArr38[0] = -1;
        Lit117 = IntNum.make(iArr38);
        int[] iArr39 = new int[2];
        iArr39[0] = -4009239;
        Lit116 = IntNum.make(iArr39);
        int[] iArr40 = new int[2];
        iArr40[0] = -1;
        Lit109 = IntNum.make(iArr40);
        int[] iArr41 = new int[2];
        iArr41[0] = -4009239;
        Lit108 = IntNum.make(iArr41);
        int[] iArr42 = new int[2];
        iArr42[0] = -1;
        Lit101 = IntNum.make(iArr42);
        int[] iArr43 = new int[2];
        iArr43[0] = -9861163;
        Lit100 = IntNum.make(iArr43);
        int[] iArr44 = new int[2];
        iArr44[0] = -1;
        Lit96 = IntNum.make(iArr44);
        int[] iArr45 = new int[2];
        iArr45[0] = -9861163;
        Lit94 = IntNum.make(iArr45);
        int[] iArr46 = new int[2];
        iArr46[0] = -1;
        Lit84 = IntNum.make(iArr46);
        int[] iArr47 = new int[2];
        iArr47[0] = -4009239;
        Lit83 = IntNum.make(iArr47);
        int[] iArr48 = new int[2];
        iArr48[0] = -1;
        Lit61 = IntNum.make(iArr48);
        int[] iArr49 = new int[2];
        iArr49[0] = -4009239;
        Lit60 = IntNum.make(iArr49);
        int[] iArr50 = new int[2];
        iArr50[0] = -1;
        Lit54 = IntNum.make(iArr50);
        int[] iArr51 = new int[2];
        iArr51[0] = -4009239;
        Lit52 = IntNum.make(iArr51);
        int[] iArr52 = new int[2];
        iArr52[0] = -1;
        Lit44 = IntNum.make(iArr52);
        int[] iArr53 = new int[2];
        iArr53[0] = -4009239;
        Lit38 = IntNum.make(iArr53);
        int[] iArr54 = new int[2];
        iArr54[0] = -1;
        Lit29 = IntNum.make(iArr54);
        int[] iArr55 = new int[2];
        iArr55[0] = -9861163;
        Lit26 = IntNum.make(iArr55);
        int[] iArr56 = new int[2];
        iArr56[0] = -1;
        Lit16 = IntNum.make(iArr56);
    }

    public Bhaktapur() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit338, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit339, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit340, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit341, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit342, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit343, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit344, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit345, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit346, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit347, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit348, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit349, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit350, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit351, 8194);
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
        this.correct_ans$Click = new ModuleMethod(frame2, 29, Lit48, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 31, (Object) null, 0);
        this.Button4$Click = new ModuleMethod(frame2, 32, Lit57, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 33, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 34, (Object) null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 35, Lit65, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 36, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 37, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 39, (Object) null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 40, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 41, (Object) null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 42, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 43, (Object) null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 44, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 45, (Object) null, 0);
        this.Button3$Click = new ModuleMethod(frame2, 46, Lit87, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 47, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 48, (Object) null, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 49, (Object) null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 50, (Object) null, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 51, (Object) null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 52, (Object) null, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 53, (Object) null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 54, (Object) null, 0);
        lambda$Fn33 = new ModuleMethod(frame2, 55, (Object) null, 0);
        lambda$Fn34 = new ModuleMethod(frame2, 56, (Object) null, 0);
        this.correct_ans3$Click = new ModuleMethod(frame2, 57, Lit113, 0);
        lambda$Fn35 = new ModuleMethod(frame2, 58, (Object) null, 0);
        lambda$Fn36 = new ModuleMethod(frame2, 59, (Object) null, 0);
        this.Button9$Click = new ModuleMethod(frame2, 60, Lit121, 0);
        lambda$Fn37 = new ModuleMethod(frame2, 61, (Object) null, 0);
        lambda$Fn38 = new ModuleMethod(frame2, 62, (Object) null, 0);
        this.Button12$Click = new ModuleMethod(frame2, 63, Lit128, 0);
        lambda$Fn39 = new ModuleMethod(frame2, 64, (Object) null, 0);
        lambda$Fn40 = new ModuleMethod(frame2, 65, (Object) null, 0);
        lambda$Fn41 = new ModuleMethod(frame2, 66, (Object) null, 0);
        lambda$Fn42 = new ModuleMethod(frame2, 67, (Object) null, 0);
        lambda$Fn43 = new ModuleMethod(frame2, 68, (Object) null, 0);
        lambda$Fn44 = new ModuleMethod(frame2, 69, (Object) null, 0);
        lambda$Fn45 = new ModuleMethod(frame2, 70, (Object) null, 0);
        lambda$Fn46 = new ModuleMethod(frame2, 71, (Object) null, 0);
        lambda$Fn47 = new ModuleMethod(frame2, 72, (Object) null, 0);
        lambda$Fn48 = new ModuleMethod(frame2, 73, (Object) null, 0);
        this.Button11$Click = new ModuleMethod(frame2, 74, Lit148, 0);
        lambda$Fn49 = new ModuleMethod(frame2, 75, (Object) null, 0);
        lambda$Fn50 = new ModuleMethod(frame2, 76, (Object) null, 0);
        lambda$Fn51 = new ModuleMethod(frame2, 77, (Object) null, 0);
        lambda$Fn52 = new ModuleMethod(frame2, 78, (Object) null, 0);
        lambda$Fn53 = new ModuleMethod(frame2, 79, (Object) null, 0);
        lambda$Fn54 = new ModuleMethod(frame2, 80, (Object) null, 0);
        lambda$Fn55 = new ModuleMethod(frame2, 81, (Object) null, 0);
        lambda$Fn56 = new ModuleMethod(frame2, 82, (Object) null, 0);
        lambda$Fn57 = new ModuleMethod(frame2, 83, (Object) null, 0);
        lambda$Fn58 = new ModuleMethod(frame2, 84, (Object) null, 0);
        lambda$Fn59 = new ModuleMethod(frame2, 85, (Object) null, 0);
        lambda$Fn60 = new ModuleMethod(frame2, 86, (Object) null, 0);
        this.Button17$Click = new ModuleMethod(frame2, 87, Lit174, 0);
        lambda$Fn61 = new ModuleMethod(frame2, 88, (Object) null, 0);
        lambda$Fn62 = new ModuleMethod(frame2, 89, (Object) null, 0);
        this.correct5$Click = new ModuleMethod(frame2, 90, Lit181, 0);
        lambda$Fn63 = new ModuleMethod(frame2, 91, (Object) null, 0);
        lambda$Fn64 = new ModuleMethod(frame2, 92, (Object) null, 0);
        this.Button19$Click = new ModuleMethod(frame2, 93, Lit188, 0);
        lambda$Fn65 = new ModuleMethod(frame2, 94, (Object) null, 0);
        lambda$Fn66 = new ModuleMethod(frame2, 95, (Object) null, 0);
        this.Button20$Click = new ModuleMethod(frame2, 96, Lit195, 0);
        lambda$Fn67 = new ModuleMethod(frame2, 97, (Object) null, 0);
        lambda$Fn68 = new ModuleMethod(frame2, 98, (Object) null, 0);
        lambda$Fn69 = new ModuleMethod(frame2, 99, (Object) null, 0);
        lambda$Fn70 = new ModuleMethod(frame2, 100, (Object) null, 0);
        lambda$Fn71 = new ModuleMethod(frame2, 101, (Object) null, 0);
        lambda$Fn72 = new ModuleMethod(frame2, 102, (Object) null, 0);
        lambda$Fn73 = new ModuleMethod(frame2, 103, (Object) null, 0);
        lambda$Fn74 = new ModuleMethod(frame2, 104, (Object) null, 0);
        lambda$Fn75 = new ModuleMethod(frame2, 105, (Object) null, 0);
        lambda$Fn76 = new ModuleMethod(frame2, 106, (Object) null, 0);
        lambda$Fn77 = new ModuleMethod(frame2, 107, (Object) null, 0);
        lambda$Fn78 = new ModuleMethod(frame2, 108, (Object) null, 0);
        lambda$Fn79 = new ModuleMethod(frame2, 109, (Object) null, 0);
        lambda$Fn80 = new ModuleMethod(frame2, 110, (Object) null, 0);
        lambda$Fn81 = new ModuleMethod(frame2, 111, (Object) null, 0);
        lambda$Fn82 = new ModuleMethod(frame2, 112, (Object) null, 0);
        this.Button21$Click = new ModuleMethod(frame2, 113, Lit229, 0);
        lambda$Fn83 = new ModuleMethod(frame2, 114, (Object) null, 0);
        lambda$Fn84 = new ModuleMethod(frame2, 115, (Object) null, 0);
        this.correct8$Click = new ModuleMethod(frame2, 116, Lit236, 0);
        lambda$Fn85 = new ModuleMethod(frame2, 117, (Object) null, 0);
        lambda$Fn86 = new ModuleMethod(frame2, 118, (Object) null, 0);
        this.Button23$Click = new ModuleMethod(frame2, 119, Lit243, 0);
        lambda$Fn87 = new ModuleMethod(frame2, 120, (Object) null, 0);
        lambda$Fn88 = new ModuleMethod(frame2, 121, (Object) null, 0);
        this.Button24$Click = new ModuleMethod(frame2, 122, Lit250, 0);
        lambda$Fn89 = new ModuleMethod(frame2, 123, (Object) null, 0);
        lambda$Fn90 = new ModuleMethod(frame2, 124, (Object) null, 0);
        lambda$Fn91 = new ModuleMethod(frame2, 125, (Object) null, 0);
        lambda$Fn92 = new ModuleMethod(frame2, 126, (Object) null, 0);
        lambda$Fn93 = new ModuleMethod(frame2, 127, (Object) null, 0);
        lambda$Fn94 = new ModuleMethod(frame2, 128, (Object) null, 0);
        lambda$Fn95 = new ModuleMethod(frame2, 129, (Object) null, 0);
        lambda$Fn96 = new ModuleMethod(frame2, 130, (Object) null, 0);
        lambda$Fn97 = new ModuleMethod(frame2, 131, (Object) null, 0);
        lambda$Fn98 = new ModuleMethod(frame2, 132, (Object) null, 0);
        lambda$Fn99 = new ModuleMethod(frame2, 133, (Object) null, 0);
        lambda$Fn100 = new ModuleMethod(frame2, 134, (Object) null, 0);
        this.Button14$Click = new ModuleMethod(frame2, 135, Lit278, 0);
        lambda$Fn101 = new ModuleMethod(frame2, 136, (Object) null, 0);
        lambda$Fn102 = new ModuleMethod(frame2, 137, (Object) null, 0);
        this.Button16$Click = new ModuleMethod(frame2, 138, Lit285, 0);
        lambda$Fn103 = new ModuleMethod(frame2, 139, (Object) null, 0);
        lambda$Fn104 = new ModuleMethod(frame2, 140, (Object) null, 0);
        this.Button13$Click = new ModuleMethod(frame2, 141, Lit293, 0);
        lambda$Fn105 = new ModuleMethod(frame2, 142, (Object) null, 0);
        lambda$Fn106 = new ModuleMethod(frame2, 143, (Object) null, 0);
        this.correct_ans4$Click = new ModuleMethod(frame2, 144, Lit300, 0);
        lambda$Fn107 = new ModuleMethod(frame2, 145, (Object) null, 0);
        lambda$Fn108 = new ModuleMethod(frame2, 146, (Object) null, 0);
        lambda$Fn109 = new ModuleMethod(frame2, 147, (Object) null, 0);
        lambda$Fn110 = new ModuleMethod(frame2, 148, (Object) null, 0);
        lambda$Fn111 = new ModuleMethod(frame2, 149, (Object) null, 0);
        lambda$Fn112 = new ModuleMethod(frame2, 150, (Object) null, 0);
        lambda$Fn113 = new ModuleMethod(frame2, 151, (Object) null, 0);
        lambda$Fn114 = new ModuleMethod(frame2, 152, (Object) null, 0);
        lambda$Fn115 = new ModuleMethod(frame2, 153, (Object) null, 0);
        lambda$Fn116 = new ModuleMethod(frame2, 154, (Object) null, 0);
        lambda$Fn117 = new ModuleMethod(frame2, 155, (Object) null, 0);
        lambda$Fn118 = new ModuleMethod(frame2, 156, (Object) null, 0);
        lambda$Fn119 = new ModuleMethod(frame2, 157, (Object) null, 0);
        lambda$Fn120 = new ModuleMethod(frame2, 158, (Object) null, 0);
        this.submit$Click = new ModuleMethod(frame2, 159, Lit330, 0);
        lambda$Fn121 = new ModuleMethod(frame2, ComponentConstants.TEXTBOX_PREFERRED_WIDTH, (Object) null, 0);
        lambda$Fn122 = new ModuleMethod(frame2, 161, (Object) null, 0);
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
        Bhaktapur = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C0609runtime.$instance.run();
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Byte_me", Lit4);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "slidevertical", Lit4);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Boolean.TRUE, Lit7);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Fixed", Lit4);
            Values.writeValues(C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "Bhaktapur", Lit4), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn2));
        }
        this.VerticalScrollArrangement1 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit0, Lit10, Lit11, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit20, Lit11, lambda$Fn4);
        }
        this.HorizontalArrangement17 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit21, Lit22, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit11, Lit23, Lit22, Boolean.FALSE);
        }
        this.Label42 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit22, Lit24, Lit25, lambda$Fn5), $result);
        } else {
            addToComponents(Lit22, Lit30, Lit25, lambda$Fn6);
        }
        this.TableArrangement1 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit31, Lit32, lambda$Fn7), $result);
        } else {
            addToComponents(Lit11, Lit35, Lit32, lambda$Fn8);
        }
        this.correct_ans = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit32, Lit36, Lit37, lambda$Fn9), $result);
        } else {
            addToComponents(Lit32, Lit46, Lit37, lambda$Fn10);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit48, this.correct_ans$Click);
        } else {
            addToFormEnvironment(Lit48, this.correct_ans$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "correct_ans", "Click");
        } else {
            addToEvents(Lit37, Lit49);
        }
        this.Button4 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit32, Lit50, Lit51, lambda$Fn11), $result);
        } else {
            addToComponents(Lit32, Lit55, Lit51, lambda$Fn12);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit57, this.Button4$Click);
        } else {
            addToFormEnvironment(Lit57, this.Button4$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button4", "Click");
        } else {
            addToEvents(Lit51, Lit49);
        }
        this.Button1 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit32, Lit58, Lit59, lambda$Fn13), $result);
        } else {
            addToComponents(Lit32, Lit63, Lit59, lambda$Fn14);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit65, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit65, this.Button1$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit59, Lit49);
        }
        this.Label5 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit32, Lit66, Lit67, lambda$Fn15), $result);
        } else {
            addToComponents(Lit32, Lit71, Lit67, lambda$Fn16);
        }
        this.Label6 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit32, Lit72, Lit73, lambda$Fn17), $result);
        } else {
            addToComponents(Lit32, Lit74, Lit73, lambda$Fn18);
        }
        this.Label7 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit32, Lit75, Lit76, lambda$Fn19), $result);
        } else {
            addToComponents(Lit32, Lit77, Lit76, lambda$Fn20);
        }
        this.Label8 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit32, Lit78, Lit79, lambda$Fn21), $result);
        } else {
            addToComponents(Lit32, Lit80, Lit79, lambda$Fn22);
        }
        this.Button3 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit32, Lit81, Lit82, lambda$Fn23), $result);
        } else {
            addToComponents(Lit32, Lit85, Lit82, lambda$Fn24);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit87, this.Button3$Click);
        } else {
            addToFormEnvironment(Lit87, this.Button3$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button3", "Click");
        } else {
            addToEvents(Lit82, Lit49);
        }
        this.HorizontalArrangement4 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit88, Lit89, lambda$Fn25), $result);
        } else {
            addToComponents(Lit11, Lit91, Lit89, lambda$Fn26);
        }
        this.Label3 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit92, Lit93, lambda$Fn27), $result);
        } else {
            addToComponents(Lit11, Lit97, Lit93, lambda$Fn28);
        }
        this.Label43 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit98, Lit99, lambda$Fn29), $result);
        } else {
            addToComponents(Lit11, Lit102, Lit99, lambda$Fn30);
        }
        this.TableArrangement3 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit103, Lit104, lambda$Fn31), $result);
        } else {
            addToComponents(Lit11, Lit105, Lit104, lambda$Fn32);
        }
        this.correct_ans3 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit104, Lit106, Lit107, lambda$Fn33), $result);
        } else {
            addToComponents(Lit104, Lit111, Lit107, lambda$Fn34);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit113, this.correct_ans3$Click);
        } else {
            addToFormEnvironment(Lit113, this.correct_ans3$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "correct_ans3", "Click");
        } else {
            addToEvents(Lit107, Lit49);
        }
        this.Button9 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit104, Lit114, Lit115, lambda$Fn35), $result);
        } else {
            addToComponents(Lit104, Lit119, Lit115, lambda$Fn36);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit121, this.Button9$Click);
        } else {
            addToFormEnvironment(Lit121, this.Button9$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button9", "Click");
        } else {
            addToEvents(Lit115, Lit49);
        }
        this.Button12 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit104, Lit122, Lit123, lambda$Fn37), $result);
        } else {
            addToComponents(Lit104, Lit126, Lit123, lambda$Fn38);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit128, this.Button12$Click);
        } else {
            addToFormEnvironment(Lit128, this.Button12$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button12", "Click");
        } else {
            addToEvents(Lit123, Lit49);
        }
        this.Label13 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit104, Lit129, Lit130, lambda$Fn39), $result);
        } else {
            addToComponents(Lit104, Lit131, Lit130, lambda$Fn40);
        }
        this.Label14 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit104, Lit132, Lit133, lambda$Fn41), $result);
        } else {
            addToComponents(Lit104, Lit134, Lit133, lambda$Fn42);
        }
        this.Label15 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit104, Lit135, Lit136, lambda$Fn43), $result);
        } else {
            addToComponents(Lit104, Lit137, Lit136, lambda$Fn44);
        }
        this.Label16 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit104, Lit138, Lit139, lambda$Fn45), $result);
        } else {
            addToComponents(Lit104, Lit140, Lit139, lambda$Fn46);
        }
        this.Button11 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit104, Lit141, Lit142, lambda$Fn47), $result);
        } else {
            addToComponents(Lit104, Lit146, Lit142, lambda$Fn48);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit148, this.Button11$Click);
        } else {
            addToFormEnvironment(Lit148, this.Button11$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button11", "Click");
        } else {
            addToEvents(Lit142, Lit49);
        }
        this.HorizontalArrangement5 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit149, Lit150, lambda$Fn49), $result);
        } else {
            addToComponents(Lit11, Lit152, Lit150, lambda$Fn50);
        }
        this.Label4 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit153, Lit154, lambda$Fn51), $result);
        } else {
            addToComponents(Lit11, Lit157, Lit154, lambda$Fn52);
        }
        this.TableArrangement6 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit158, Lit159, lambda$Fn53), $result);
        } else {
            addToComponents(Lit11, Lit160, Lit159, lambda$Fn54);
        }
        this.Label22 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit159, Lit161, Lit162, lambda$Fn55), $result);
        } else {
            addToComponents(Lit159, Lit163, Lit162, lambda$Fn56);
        }
        this.Label23 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit159, Lit164, Lit165, lambda$Fn57), $result);
        } else {
            addToComponents(Lit159, Lit166, Lit165, lambda$Fn58);
        }
        this.Button17 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit159, Lit167, Lit168, lambda$Fn59), $result);
        } else {
            addToComponents(Lit159, Lit172, Lit168, lambda$Fn60);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit174, this.Button17$Click);
        } else {
            addToFormEnvironment(Lit174, this.Button17$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button17", "Click");
        } else {
            addToEvents(Lit168, Lit49);
        }
        this.correct5 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit159, Lit175, Lit176, lambda$Fn61), $result);
        } else {
            addToComponents(Lit159, Lit179, Lit176, lambda$Fn62);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit181, this.correct5$Click);
        } else {
            addToFormEnvironment(Lit181, this.correct5$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "correct5", "Click");
        } else {
            addToEvents(Lit176, Lit49);
        }
        this.Button19 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit159, Lit182, Lit183, lambda$Fn63), $result);
        } else {
            addToComponents(Lit159, Lit186, Lit183, lambda$Fn64);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit188, this.Button19$Click);
        } else {
            addToFormEnvironment(Lit188, this.Button19$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button19", "Click");
        } else {
            addToEvents(Lit183, Lit49);
        }
        this.Button20 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit159, Lit189, Lit190, lambda$Fn65), $result);
        } else {
            addToComponents(Lit159, Lit193, Lit190, lambda$Fn66);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit195, this.Button20$Click);
        } else {
            addToFormEnvironment(Lit195, this.Button20$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button20", "Click");
        } else {
            addToEvents(Lit190, Lit49);
        }
        this.Label24 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit159, Lit196, Lit197, lambda$Fn67), $result);
        } else {
            addToComponents(Lit159, Lit198, Lit197, lambda$Fn68);
        }
        this.Label25 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit159, Lit199, Lit200, lambda$Fn69), $result);
        } else {
            addToComponents(Lit159, Lit201, Lit200, lambda$Fn70);
        }
        this.HorizontalArrangement14 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit202, Lit203, lambda$Fn71), $result);
        } else {
            addToComponents(Lit11, Lit205, Lit203, lambda$Fn72);
        }
        this.HorizontalArrangement7 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit206, Lit207, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit11, Lit208, Lit207, Boolean.FALSE);
        }
        this.Label21 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit207, Lit209, Lit210, lambda$Fn73), $result);
        } else {
            addToComponents(Lit207, Lit213, Lit210, lambda$Fn74);
        }
        this.TableArrangement7 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit214, Lit215, lambda$Fn75), $result);
        } else {
            addToComponents(Lit11, Lit216, Lit215, lambda$Fn76);
        }
        this.Label27 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit215, Lit217, Lit218, lambda$Fn77), $result);
        } else {
            addToComponents(Lit215, Lit219, Lit218, lambda$Fn78);
        }
        this.Label28 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit215, Lit220, Lit221, lambda$Fn79), $result);
        } else {
            addToComponents(Lit215, Lit222, Lit221, lambda$Fn80);
        }
        this.Button21 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit215, Lit223, Lit224, lambda$Fn81), $result);
        } else {
            addToComponents(Lit215, Lit227, Lit224, lambda$Fn82);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit229, this.Button21$Click);
        } else {
            addToFormEnvironment(Lit229, this.Button21$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button21", "Click");
        } else {
            addToEvents(Lit224, Lit49);
        }
        this.correct8 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit215, Lit230, Lit231, lambda$Fn83), $result);
        } else {
            addToComponents(Lit215, Lit234, Lit231, lambda$Fn84);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit236, this.correct8$Click);
        } else {
            addToFormEnvironment(Lit236, this.correct8$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "correct8", "Click");
        } else {
            addToEvents(Lit231, Lit49);
        }
        this.Button23 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit215, Lit237, Lit238, lambda$Fn85), $result);
        } else {
            addToComponents(Lit215, Lit241, Lit238, lambda$Fn86);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit243, this.Button23$Click);
        } else {
            addToFormEnvironment(Lit243, this.Button23$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button23", "Click");
        } else {
            addToEvents(Lit238, Lit49);
        }
        this.Button24 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit215, Lit244, Lit245, lambda$Fn87), $result);
        } else {
            addToComponents(Lit215, Lit248, Lit245, lambda$Fn88);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit250, this.Button24$Click);
        } else {
            addToFormEnvironment(Lit250, this.Button24$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button24", "Click");
        } else {
            addToEvents(Lit245, Lit49);
        }
        this.Label29 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit215, Lit251, Lit252, lambda$Fn89), $result);
        } else {
            addToComponents(Lit215, Lit253, Lit252, lambda$Fn90);
        }
        this.Label30 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit215, Lit254, Lit255, lambda$Fn91), $result);
        } else {
            addToComponents(Lit215, Lit256, Lit255, lambda$Fn92);
        }
        this.HorizontalArrangement15 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit257, Lit258, lambda$Fn93), $result);
        } else {
            addToComponents(Lit11, Lit260, Lit258, lambda$Fn94);
        }
        this.HorizontalArrangement16 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit261, Lit262, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit11, Lit263, Lit262, Boolean.FALSE);
        }
        this.Label41 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit262, Lit264, Lit265, lambda$Fn95), $result);
        } else {
            addToComponents(Lit262, Lit268, Lit265, lambda$Fn96);
        }
        this.TableArrangement5 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit269, Lit270, lambda$Fn97), $result);
        } else {
            addToComponents(Lit11, Lit271, Lit270, lambda$Fn98);
        }
        this.Button14 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit270, Lit272, Lit273, lambda$Fn99), $result);
        } else {
            addToComponents(Lit270, Lit276, Lit273, lambda$Fn100);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit278, this.Button14$Click);
        } else {
            addToFormEnvironment(Lit278, this.Button14$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button14", "Click");
        } else {
            addToEvents(Lit273, Lit49);
        }
        this.Button16 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit270, Lit279, Lit280, lambda$Fn101), $result);
        } else {
            addToComponents(Lit270, Lit283, Lit280, lambda$Fn102);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit285, this.Button16$Click);
        } else {
            addToFormEnvironment(Lit285, this.Button16$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button16", "Click");
        } else {
            addToEvents(Lit280, Lit49);
        }
        this.Button13 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit270, Lit286, Lit287, lambda$Fn103), $result);
        } else {
            addToComponents(Lit270, Lit291, Lit287, lambda$Fn104);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit293, this.Button13$Click);
        } else {
            addToFormEnvironment(Lit293, this.Button13$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Button13", "Click");
        } else {
            addToEvents(Lit287, Lit49);
        }
        this.correct_ans4 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit270, Lit294, Lit295, lambda$Fn105), $result);
        } else {
            addToComponents(Lit270, Lit298, Lit295, lambda$Fn106);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit300, this.correct_ans4$Click);
        } else {
            addToFormEnvironment(Lit300, this.correct_ans4$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "correct_ans4", "Click");
        } else {
            addToEvents(Lit295, Lit49);
        }
        this.Label17 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit270, Lit301, Lit302, lambda$Fn107), $result);
        } else {
            addToComponents(Lit270, Lit303, Lit302, lambda$Fn108);
        }
        this.Label18 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit270, Lit304, Lit305, lambda$Fn109), $result);
        } else {
            addToComponents(Lit270, Lit306, Lit305, lambda$Fn110);
        }
        this.Label19 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit270, Lit307, Lit308, lambda$Fn111), $result);
        } else {
            addToComponents(Lit270, Lit309, Lit308, lambda$Fn112);
        }
        this.Label20 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit270, Lit310, Lit311, lambda$Fn113), $result);
        } else {
            addToComponents(Lit270, Lit312, Lit311, lambda$Fn114);
        }
        this.HorizontalArrangement18 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit313, Lit314, lambda$Fn115), $result);
        } else {
            addToComponents(Lit11, Lit316, Lit314, lambda$Fn116);
        }
        this.HorizontalArrangement2 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit11, Lit317, Lit318, lambda$Fn117), $result);
        } else {
            addToComponents(Lit11, Lit322, Lit318, lambda$Fn118);
        }
        this.submit = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit318, Lit323, Lit324, lambda$Fn119), $result);
        } else {
            addToComponents(Lit318, Lit328, Lit324, lambda$Fn120);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit330, this.submit$Click);
        } else {
            addToFormEnvironment(Lit330, this.submit$Click);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "submit", "Click");
        } else {
            addToEvents(Lit324, Lit49);
        }
        this.HorizontalArrangement1 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit0, Lit331, Lit332, lambda$Fn121), $result);
        } else {
            addToComponents(Lit0, Lit337, Lit332, lambda$Fn122);
        }
        C0609runtime.initRuntime();
    }

    static Object lambda3() {
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Byte_me", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "slidevertical", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Fixed", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "Bhaktapur", Lit4);
    }

    static Object lambda4() {
        C0609runtime.setAndCoerceProperty$Ex(Lit11, Lit12, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit11, Lit15, Lit16, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit11, Lit17, Lit18, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit11, Lit19, Lit18, Lit14);
    }

    static Object lambda5() {
        C0609runtime.setAndCoerceProperty$Ex(Lit11, Lit12, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit11, Lit15, Lit16, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit11, Lit17, Lit18, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit11, Lit19, Lit18, Lit14);
    }

    static Object lambda6() {
        C0609runtime.setAndCoerceProperty$Ex(Lit25, Lit15, Lit26, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit25, Lit27, "What is the main source of Air Pollution in Bhaktapur?", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit25, Lit28, Lit29, Lit14);
    }

    static Object lambda7() {
        C0609runtime.setAndCoerceProperty$Ex(Lit25, Lit15, Lit26, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit25, Lit27, "What is the main source of Air Pollution in Bhaktapur?", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit25, Lit28, Lit29, Lit14);
    }

    static Object lambda8() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Lit34, Lit14);
    }

    static Object lambda9() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Lit34, Lit14);
    }

    static Object lambda10() {
        C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit15, Lit38, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit42, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit27, "Brick Kiln", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit28, Lit44, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit19, Lit45, Lit14);
    }

    static Object lambda11() {
        C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit15, Lit38, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit42, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit27, "Brick Kiln", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit28, Lit44, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit19, Lit45, Lit14);
    }

    public Object correct_ans$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit37, Lit15, Lit47, Lit14);
    }

    static Object lambda12() {
        C0609runtime.setAndCoerceProperty$Ex(Lit51, Lit15, Lit52, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit51, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit51, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit51, Lit42, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit51, Lit27, "Agriculture", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit51, Lit28, Lit54, Lit14);
    }

    static Object lambda13() {
        C0609runtime.setAndCoerceProperty$Ex(Lit51, Lit15, Lit52, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit51, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit51, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit51, Lit42, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit51, Lit27, "Agriculture", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit51, Lit28, Lit54, Lit14);
    }

    public Object Button4$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit51, Lit15, Lit56, Lit14);
    }

    static Object lambda14() {
        C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit15, Lit60, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit42, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit27, "Vehicle Emissions", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit28, Lit61, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit19, Lit62, Lit14);
    }

    static Object lambda15() {
        C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit15, Lit60, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit42, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit27, "Vehicle Emissions", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit28, Lit61, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit19, Lit62, Lit14);
    }

    public Object Button1$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit59, Lit15, Lit64, Lit14);
    }

    static Object lambda16() {
        C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit27, "A", Lit4);
    }

    static Object lambda17() {
        C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit67, Lit27, "A", Lit4);
    }

    static Object lambda18() {
        C0609runtime.setAndCoerceProperty$Ex(Lit73, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit73, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit73, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit73, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit73, Lit27, "C", Lit4);
    }

    static Object lambda19() {
        C0609runtime.setAndCoerceProperty$Ex(Lit73, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit73, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit73, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit73, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit73, Lit27, "C", Lit4);
    }

    static Object lambda20() {
        C0609runtime.setAndCoerceProperty$Ex(Lit76, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit76, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit76, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit76, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit76, Lit27, "B", Lit4);
    }

    static Object lambda21() {
        C0609runtime.setAndCoerceProperty$Ex(Lit76, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit76, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit76, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit76, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit76, Lit27, "B", Lit4);
    }

    static Object lambda22() {
        C0609runtime.setAndCoerceProperty$Ex(Lit79, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit79, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit79, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit79, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit79, Lit27, "D", Lit4);
    }

    static Object lambda23() {
        C0609runtime.setAndCoerceProperty$Ex(Lit79, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit79, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit79, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit79, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit79, Lit27, "D", Lit4);
    }

    static Object lambda24() {
        C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit15, Lit83, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit42, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit27, "Resuspended Dust", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit28, Lit84, Lit14);
    }

    static Object lambda25() {
        C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit15, Lit83, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit42, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit27, "Resuspended Dust", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit28, Lit84, Lit14);
    }

    public Object Button3$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit82, Lit15, Lit86, Lit14);
    }

    static Object lambda26() {
        C0609runtime.setAndCoerceProperty$Ex(Lit89, Lit17, Lit90, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit89, Lit19, Lit18, Lit14);
    }

    static Object lambda27() {
        C0609runtime.setAndCoerceProperty$Ex(Lit89, Lit17, Lit90, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit89, Lit19, Lit18, Lit14);
    }

    static Object lambda28() {
        C0609runtime.setAndCoerceProperty$Ex(Lit93, Lit15, Lit94, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit93, Lit27, "What value of pm2.5 isunhealthy for", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit93, Lit95, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit93, Lit28, Lit96, Lit14);
    }

    static Object lambda29() {
        C0609runtime.setAndCoerceProperty$Ex(Lit93, Lit15, Lit94, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit93, Lit27, "What value of pm2.5 isunhealthy for", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit93, Lit95, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit93, Lit28, Lit96, Lit14);
    }

    static Object lambda30() {
        C0609runtime.setAndCoerceProperty$Ex(Lit99, Lit15, Lit100, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit99, Lit27, "people in Bhaktapur?", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit99, Lit28, Lit101, Lit14);
    }

    static Object lambda31() {
        C0609runtime.setAndCoerceProperty$Ex(Lit99, Lit15, Lit100, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit99, Lit27, "people in Bhaktapur?", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit99, Lit28, Lit101, Lit14);
    }

    static Object lambda32() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit104, Lit33, Lit34, Lit14);
    }

    static Object lambda33() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit104, Lit33, Lit34, Lit14);
    }

    static Object lambda34() {
        C0609runtime.setAndCoerceProperty$Ex(Lit107, Lit15, Lit108, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit107, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit107, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit107, Lit27, "109", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit107, Lit28, Lit109, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit107, Lit19, Lit110, Lit14);
    }

    static Object lambda35() {
        C0609runtime.setAndCoerceProperty$Ex(Lit107, Lit15, Lit108, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit107, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit107, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit107, Lit27, "109", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit107, Lit28, Lit109, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit107, Lit19, Lit110, Lit14);
    }

    public Object correct_ans3$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit107, Lit15, Lit112, Lit14);
    }

    static Object lambda36() {
        C0609runtime.setAndCoerceProperty$Ex(Lit115, Lit15, Lit116, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit115, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit115, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit115, Lit27, "140", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit115, Lit28, Lit117, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit115, Lit19, Lit118, Lit14);
    }

    static Object lambda37() {
        C0609runtime.setAndCoerceProperty$Ex(Lit115, Lit15, Lit116, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit115, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit115, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit115, Lit27, "140", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit115, Lit28, Lit117, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit115, Lit19, Lit118, Lit14);
    }

    public Object Button9$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit115, Lit15, Lit120, Lit14);
    }

    static Object lambda38() {
        C0609runtime.setAndCoerceProperty$Ex(Lit123, Lit15, Lit124, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit123, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit123, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit123, Lit27, "113", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit123, Lit28, Lit125, Lit14);
    }

    static Object lambda39() {
        C0609runtime.setAndCoerceProperty$Ex(Lit123, Lit15, Lit124, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit123, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit123, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit123, Lit27, "113", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit123, Lit28, Lit125, Lit14);
    }

    public Object Button12$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit123, Lit15, Lit127, Lit14);
    }

    static Object lambda40() {
        C0609runtime.setAndCoerceProperty$Ex(Lit130, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit130, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit130, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit130, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit130, Lit27, "A", Lit4);
    }

    static Object lambda41() {
        C0609runtime.setAndCoerceProperty$Ex(Lit130, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit130, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit130, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit130, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit130, Lit27, "A", Lit4);
    }

    static Object lambda42() {
        C0609runtime.setAndCoerceProperty$Ex(Lit133, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit133, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit133, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit133, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit133, Lit27, "B", Lit4);
    }

    static Object lambda43() {
        C0609runtime.setAndCoerceProperty$Ex(Lit133, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit133, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit133, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit133, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit133, Lit27, "B", Lit4);
    }

    /* compiled from: Bhaktapur.yail */
    public class frame extends ModuleBody {
        Bhaktapur $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Bhaktapur)) {
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
                    if (!(obj instanceof Bhaktapur)) {
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
                    if (!(obj instanceof Bhaktapur)) {
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
                    if (!(obj instanceof Bhaktapur)) {
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
                    Bhaktapur bhaktapur = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    bhaktapur.dispatchGenericEvent(component, str, z, (Object[]) obj4);
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
                    return Bhaktapur.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Bhaktapur.lambda3();
                case 21:
                    return Bhaktapur.lambda4();
                case 22:
                    return Bhaktapur.lambda5();
                case 23:
                    return Bhaktapur.lambda6();
                case 24:
                    return Bhaktapur.lambda7();
                case 25:
                    return Bhaktapur.lambda8();
                case 26:
                    return Bhaktapur.lambda9();
                case 27:
                    return Bhaktapur.lambda10();
                case 28:
                    return Bhaktapur.lambda11();
                case 29:
                    return this.$main.correct_ans$Click();
                case 30:
                    return Bhaktapur.lambda12();
                case 31:
                    return Bhaktapur.lambda13();
                case 32:
                    return this.$main.Button4$Click();
                case 33:
                    return Bhaktapur.lambda14();
                case 34:
                    return Bhaktapur.lambda15();
                case 35:
                    return this.$main.Button1$Click();
                case 36:
                    return Bhaktapur.lambda16();
                case 37:
                    return Bhaktapur.lambda17();
                case 38:
                    return Bhaktapur.lambda18();
                case 39:
                    return Bhaktapur.lambda19();
                case 40:
                    return Bhaktapur.lambda20();
                case 41:
                    return Bhaktapur.lambda21();
                case 42:
                    return Bhaktapur.lambda22();
                case 43:
                    return Bhaktapur.lambda23();
                case 44:
                    return Bhaktapur.lambda24();
                case 45:
                    return Bhaktapur.lambda25();
                case 46:
                    return this.$main.Button3$Click();
                case 47:
                    return Bhaktapur.lambda26();
                case 48:
                    return Bhaktapur.lambda27();
                case 49:
                    return Bhaktapur.lambda28();
                case 50:
                    return Bhaktapur.lambda29();
                case 51:
                    return Bhaktapur.lambda30();
                case 52:
                    return Bhaktapur.lambda31();
                case 53:
                    return Bhaktapur.lambda32();
                case 54:
                    return Bhaktapur.lambda33();
                case 55:
                    return Bhaktapur.lambda34();
                case 56:
                    return Bhaktapur.lambda35();
                case 57:
                    return this.$main.correct_ans3$Click();
                case 58:
                    return Bhaktapur.lambda36();
                case 59:
                    return Bhaktapur.lambda37();
                case 60:
                    return this.$main.Button9$Click();
                case 61:
                    return Bhaktapur.lambda38();
                case 62:
                    return Bhaktapur.lambda39();
                case 63:
                    return this.$main.Button12$Click();
                case 64:
                    return Bhaktapur.lambda40();
                case 65:
                    return Bhaktapur.lambda41();
                case 66:
                    return Bhaktapur.lambda42();
                case 67:
                    return Bhaktapur.lambda43();
                case 68:
                    return Bhaktapur.lambda44();
                case 69:
                    return Bhaktapur.lambda45();
                case 70:
                    return Bhaktapur.lambda46();
                case 71:
                    return Bhaktapur.lambda47();
                case 72:
                    return Bhaktapur.lambda48();
                case 73:
                    return Bhaktapur.lambda49();
                case 74:
                    return this.$main.Button11$Click();
                case 75:
                    return Bhaktapur.lambda50();
                case 76:
                    return Bhaktapur.lambda51();
                case 77:
                    return Bhaktapur.lambda52();
                case 78:
                    return Bhaktapur.lambda53();
                case 79:
                    return Bhaktapur.lambda54();
                case 80:
                    return Bhaktapur.lambda55();
                case 81:
                    return Bhaktapur.lambda56();
                case 82:
                    return Bhaktapur.lambda57();
                case 83:
                    return Bhaktapur.lambda58();
                case 84:
                    return Bhaktapur.lambda59();
                case 85:
                    return Bhaktapur.lambda60();
                case 86:
                    return Bhaktapur.lambda61();
                case 87:
                    return this.$main.Button17$Click();
                case 88:
                    return Bhaktapur.lambda62();
                case 89:
                    return Bhaktapur.lambda63();
                case 90:
                    return this.$main.correct5$Click();
                case 91:
                    return Bhaktapur.lambda64();
                case 92:
                    return Bhaktapur.lambda65();
                case 93:
                    return this.$main.Button19$Click();
                case 94:
                    return Bhaktapur.lambda66();
                case 95:
                    return Bhaktapur.lambda67();
                case 96:
                    return this.$main.Button20$Click();
                case 97:
                    return Bhaktapur.lambda68();
                case 98:
                    return Bhaktapur.lambda69();
                case 99:
                    return Bhaktapur.lambda70();
                case 100:
                    return Bhaktapur.lambda71();
                case 101:
                    return Bhaktapur.lambda72();
                case 102:
                    return Bhaktapur.lambda73();
                case 103:
                    return Bhaktapur.lambda74();
                case 104:
                    return Bhaktapur.lambda75();
                case 105:
                    return Bhaktapur.lambda76();
                case 106:
                    return Bhaktapur.lambda77();
                case 107:
                    return Bhaktapur.lambda78();
                case 108:
                    return Bhaktapur.lambda79();
                case 109:
                    return Bhaktapur.lambda80();
                case 110:
                    return Bhaktapur.lambda81();
                case 111:
                    return Bhaktapur.lambda82();
                case 112:
                    return Bhaktapur.lambda83();
                case 113:
                    return this.$main.Button21$Click();
                case 114:
                    return Bhaktapur.lambda84();
                case 115:
                    return Bhaktapur.lambda85();
                case 116:
                    return this.$main.correct8$Click();
                case 117:
                    return Bhaktapur.lambda86();
                case 118:
                    return Bhaktapur.lambda87();
                case 119:
                    return this.$main.Button23$Click();
                case 120:
                    return Bhaktapur.lambda88();
                case 121:
                    return Bhaktapur.lambda89();
                case 122:
                    return this.$main.Button24$Click();
                case 123:
                    return Bhaktapur.lambda90();
                case 124:
                    return Bhaktapur.lambda91();
                case 125:
                    return Bhaktapur.lambda92();
                case 126:
                    return Bhaktapur.lambda93();
                case 127:
                    return Bhaktapur.lambda94();
                case 128:
                    return Bhaktapur.lambda95();
                case 129:
                    return Bhaktapur.lambda96();
                case 130:
                    return Bhaktapur.lambda97();
                case 131:
                    return Bhaktapur.lambda98();
                case 132:
                    return Bhaktapur.lambda99();
                case 133:
                    return Bhaktapur.lambda100();
                case 134:
                    return Bhaktapur.lambda101();
                case 135:
                    return this.$main.Button14$Click();
                case 136:
                    return Bhaktapur.lambda102();
                case 137:
                    return Bhaktapur.lambda103();
                case 138:
                    return this.$main.Button16$Click();
                case 139:
                    return Bhaktapur.lambda104();
                case 140:
                    return Bhaktapur.lambda105();
                case 141:
                    return this.$main.Button13$Click();
                case 142:
                    return Bhaktapur.lambda106();
                case 143:
                    return Bhaktapur.lambda107();
                case 144:
                    return this.$main.correct_ans4$Click();
                case 145:
                    return Bhaktapur.lambda108();
                case 146:
                    return Bhaktapur.lambda109();
                case 147:
                    return Bhaktapur.lambda110();
                case 148:
                    return Bhaktapur.lambda111();
                case 149:
                    return Bhaktapur.lambda112();
                case 150:
                    return Bhaktapur.lambda113();
                case 151:
                    return Bhaktapur.lambda114();
                case 152:
                    return Bhaktapur.lambda115();
                case 153:
                    return Bhaktapur.lambda116();
                case 154:
                    return Bhaktapur.lambda117();
                case 155:
                    return Bhaktapur.lambda118();
                case 156:
                    return Bhaktapur.lambda119();
                case 157:
                    return Bhaktapur.lambda120();
                case 158:
                    return Bhaktapur.lambda121();
                case 159:
                    return this.$main.submit$Click();
                case ComponentConstants.TEXTBOX_PREFERRED_WIDTH /*160*/:
                    return Bhaktapur.lambda122();
                case 161:
                    return Bhaktapur.lambda123();
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
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 61:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 62:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 63:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 64:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 65:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 66:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 67:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 68:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 69:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 70:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 71:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 72:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 73:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 74:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 75:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 76:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 77:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 78:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 79:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 80:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 81:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 82:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 83:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 84:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 85:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 86:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 87:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 88:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 89:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 90:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 91:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 92:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 93:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 94:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 95:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 96:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 97:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 98:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 99:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 100:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 101:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 102:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 103:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 104:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 105:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 106:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 107:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 108:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 109:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 110:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 111:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 112:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 113:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 114:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 115:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 116:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 117:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 118:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 119:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 120:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 121:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 122:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 123:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 124:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 125:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 126:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 127:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 128:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 129:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 130:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 131:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 132:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 133:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 134:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 135:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 136:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 137:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 138:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 139:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 140:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 141:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 142:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 143:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 144:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 145:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 146:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 147:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 148:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 149:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 150:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 151:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 152:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 153:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 154:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 155:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 156:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 157:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 158:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 159:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case ComponentConstants.TEXTBOX_PREFERRED_WIDTH /*160*/:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 161:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static Object lambda44() {
        C0609runtime.setAndCoerceProperty$Ex(Lit136, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit136, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit136, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit136, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit136, Lit27, "C", Lit4);
    }

    static Object lambda45() {
        C0609runtime.setAndCoerceProperty$Ex(Lit136, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit136, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit136, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit136, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit136, Lit27, "C", Lit4);
    }

    static Object lambda46() {
        C0609runtime.setAndCoerceProperty$Ex(Lit139, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit139, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit139, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit139, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit139, Lit27, "D", Lit4);
    }

    static Object lambda47() {
        C0609runtime.setAndCoerceProperty$Ex(Lit139, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit139, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit139, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit139, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit139, Lit27, "D", Lit4);
    }

    static Object lambda48() {
        C0609runtime.setAndCoerceProperty$Ex(Lit142, Lit15, Lit143, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit142, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit142, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit142, Lit27, "126", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit142, Lit28, Lit144, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit142, Lit19, Lit145, Lit14);
    }

    static Object lambda49() {
        C0609runtime.setAndCoerceProperty$Ex(Lit142, Lit15, Lit143, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit142, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit142, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit142, Lit27, "126", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit142, Lit28, Lit144, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit142, Lit19, Lit145, Lit14);
    }

    public Object Button11$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit142, Lit15, Lit147, Lit14);
    }

    static Object lambda50() {
        C0609runtime.setAndCoerceProperty$Ex(Lit150, Lit17, Lit151, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit150, Lit19, Lit18, Lit14);
    }

    static Object lambda51() {
        C0609runtime.setAndCoerceProperty$Ex(Lit150, Lit17, Lit151, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit150, Lit19, Lit18, Lit14);
    }

    static Object lambda52() {
        C0609runtime.setAndCoerceProperty$Ex(Lit154, Lit15, Lit155, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit154, Lit27, "What is the recent value of AQI  Bhaktapur?", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit154, Lit28, Lit156, Lit14);
    }

    static Object lambda53() {
        C0609runtime.setAndCoerceProperty$Ex(Lit154, Lit15, Lit155, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit154, Lit27, "What is the recent value of AQI  Bhaktapur?", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit154, Lit28, Lit156, Lit14);
    }

    static Object lambda54() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit159, Lit33, Lit34, Lit14);
    }

    static Object lambda55() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit159, Lit33, Lit34, Lit14);
    }

    static Object lambda56() {
        C0609runtime.setAndCoerceProperty$Ex(Lit162, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit162, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit162, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit162, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit162, Lit27, "A", Lit4);
    }

    static Object lambda57() {
        C0609runtime.setAndCoerceProperty$Ex(Lit162, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit162, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit162, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit162, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit162, Lit27, "A", Lit4);
    }

    static Object lambda58() {
        C0609runtime.setAndCoerceProperty$Ex(Lit165, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit165, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit165, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit165, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit165, Lit27, "C", Lit4);
    }

    static Object lambda59() {
        C0609runtime.setAndCoerceProperty$Ex(Lit165, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit165, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit165, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit165, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit165, Lit27, "C", Lit4);
    }

    static Object lambda60() {
        C0609runtime.setAndCoerceProperty$Ex(Lit168, Lit15, Lit169, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit168, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit168, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit168, Lit27, "82", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit168, Lit28, Lit170, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit168, Lit19, Lit171, Lit14);
    }

    static Object lambda61() {
        C0609runtime.setAndCoerceProperty$Ex(Lit168, Lit15, Lit169, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit168, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit168, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit168, Lit27, "82", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit168, Lit28, Lit170, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit168, Lit19, Lit171, Lit14);
    }

    public Object Button17$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit168, Lit15, Lit173, Lit14);
    }

    static Object lambda62() {
        C0609runtime.setAndCoerceProperty$Ex(Lit176, Lit15, Lit177, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit176, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit176, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit176, Lit27, "74", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit176, Lit28, Lit178, Lit14);
    }

    static Object lambda63() {
        C0609runtime.setAndCoerceProperty$Ex(Lit176, Lit15, Lit177, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit176, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit176, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit176, Lit27, "74", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit176, Lit28, Lit178, Lit14);
    }

    public Object correct5$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit176, Lit15, Lit180, Lit14);
    }

    static Object lambda64() {
        C0609runtime.setAndCoerceProperty$Ex(Lit183, Lit15, Lit184, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit183, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit183, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit183, Lit27, "51", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit183, Lit28, Lit185, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit183, Lit19, Lit171, Lit14);
    }

    static Object lambda65() {
        C0609runtime.setAndCoerceProperty$Ex(Lit183, Lit15, Lit184, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit183, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit183, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit183, Lit27, "51", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit183, Lit28, Lit185, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit183, Lit19, Lit171, Lit14);
    }

    public Object Button19$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit183, Lit15, Lit187, Lit14);
    }

    static Object lambda66() {
        C0609runtime.setAndCoerceProperty$Ex(Lit190, Lit15, Lit191, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit190, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit190, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit190, Lit27, "67", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit190, Lit28, Lit192, Lit14);
    }

    static Object lambda67() {
        C0609runtime.setAndCoerceProperty$Ex(Lit190, Lit15, Lit191, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit190, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit190, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit190, Lit27, "67", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit190, Lit28, Lit192, Lit14);
    }

    public Object Button20$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit190, Lit15, Lit194, Lit14);
    }

    static Object lambda68() {
        C0609runtime.setAndCoerceProperty$Ex(Lit197, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit197, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit197, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit197, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit197, Lit27, "B", Lit4);
    }

    static Object lambda69() {
        C0609runtime.setAndCoerceProperty$Ex(Lit197, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit197, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit197, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit197, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit197, Lit27, "B", Lit4);
    }

    static Object lambda70() {
        C0609runtime.setAndCoerceProperty$Ex(Lit200, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit200, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit200, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit200, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit200, Lit27, "D", Lit4);
    }

    static Object lambda71() {
        C0609runtime.setAndCoerceProperty$Ex(Lit200, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit200, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit200, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit200, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit200, Lit27, "D", Lit4);
    }

    static Object lambda72() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit203, Lit17, Lit204, Lit14);
    }

    static Object lambda73() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit203, Lit17, Lit204, Lit14);
    }

    static Object lambda74() {
        C0609runtime.setAndCoerceProperty$Ex(Lit210, Lit15, Lit211, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit210, Lit27, "How many vehicles are there in the valley? (2015)", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit210, Lit28, Lit212, Lit14);
    }

    static Object lambda75() {
        C0609runtime.setAndCoerceProperty$Ex(Lit210, Lit15, Lit211, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit210, Lit27, "How many vehicles are there in the valley? (2015)", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit210, Lit28, Lit212, Lit14);
    }

    static Object lambda76() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit215, Lit33, Lit34, Lit14);
    }

    static Object lambda77() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit215, Lit33, Lit34, Lit14);
    }

    static Object lambda78() {
        C0609runtime.setAndCoerceProperty$Ex(Lit218, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit218, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit218, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit218, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit218, Lit27, "A", Lit4);
    }

    static Object lambda79() {
        C0609runtime.setAndCoerceProperty$Ex(Lit218, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit218, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit218, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit218, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit218, Lit27, "A", Lit4);
    }

    static Object lambda80() {
        C0609runtime.setAndCoerceProperty$Ex(Lit221, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit221, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit221, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit221, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit221, Lit27, "C", Lit4);
    }

    static Object lambda81() {
        C0609runtime.setAndCoerceProperty$Ex(Lit221, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit221, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit221, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit221, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit221, Lit27, "C", Lit4);
    }

    static Object lambda82() {
        C0609runtime.setAndCoerceProperty$Ex(Lit224, Lit15, Lit225, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit224, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit224, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit224, Lit27, "900000", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit224, Lit28, Lit226, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit224, Lit19, Lit171, Lit14);
    }

    static Object lambda83() {
        C0609runtime.setAndCoerceProperty$Ex(Lit224, Lit15, Lit225, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit224, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit224, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit224, Lit27, "900000", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit224, Lit28, Lit226, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit224, Lit19, Lit171, Lit14);
    }

    public Object Button21$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit224, Lit15, Lit228, Lit14);
    }

    static Object lambda84() {
        C0609runtime.setAndCoerceProperty$Ex(Lit231, Lit15, Lit232, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit231, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit231, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit231, Lit27, "922900", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit231, Lit28, Lit233, Lit14);
    }

    static Object lambda85() {
        C0609runtime.setAndCoerceProperty$Ex(Lit231, Lit15, Lit232, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit231, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit231, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit231, Lit27, "922900", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit231, Lit28, Lit233, Lit14);
    }

    public Object correct8$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit231, Lit15, Lit235, Lit14);
    }

    static Object lambda86() {
        C0609runtime.setAndCoerceProperty$Ex(Lit238, Lit15, Lit239, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit238, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit238, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit238, Lit27, "1000000", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit238, Lit28, Lit240, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit238, Lit19, Lit171, Lit14);
    }

    static Object lambda87() {
        C0609runtime.setAndCoerceProperty$Ex(Lit238, Lit15, Lit239, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit238, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit238, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit238, Lit27, "1000000", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit238, Lit28, Lit240, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit238, Lit19, Lit171, Lit14);
    }

    public Object Button23$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit238, Lit15, Lit242, Lit14);
    }

    static Object lambda88() {
        C0609runtime.setAndCoerceProperty$Ex(Lit245, Lit15, Lit246, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit245, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit245, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit245, Lit27, "950990", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit245, Lit28, Lit247, Lit14);
    }

    static Object lambda89() {
        C0609runtime.setAndCoerceProperty$Ex(Lit245, Lit15, Lit246, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit245, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit245, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit245, Lit27, "950990", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit245, Lit28, Lit247, Lit14);
    }

    public Object Button24$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit245, Lit15, Lit249, Lit14);
    }

    static Object lambda90() {
        C0609runtime.setAndCoerceProperty$Ex(Lit252, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit252, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit252, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit252, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit252, Lit27, "B", Lit4);
    }

    static Object lambda91() {
        C0609runtime.setAndCoerceProperty$Ex(Lit252, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit252, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit252, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit252, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit252, Lit27, "B", Lit4);
    }

    static Object lambda92() {
        C0609runtime.setAndCoerceProperty$Ex(Lit255, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit255, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit255, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit255, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit255, Lit27, "D", Lit4);
    }

    static Object lambda93() {
        C0609runtime.setAndCoerceProperty$Ex(Lit255, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit255, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit255, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit255, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit255, Lit27, "D", Lit4);
    }

    static Object lambda94() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit258, Lit17, Lit259, Lit14);
    }

    static Object lambda95() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit258, Lit17, Lit259, Lit14);
    }

    static Object lambda96() {
        C0609runtime.setAndCoerceProperty$Ex(Lit265, Lit15, Lit266, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit265, Lit27, "In 2019, how many brick kiln were active in Bhaktapur?", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit265, Lit28, Lit267, Lit14);
    }

    static Object lambda97() {
        C0609runtime.setAndCoerceProperty$Ex(Lit265, Lit15, Lit266, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit265, Lit27, "In 2019, how many brick kiln were active in Bhaktapur?", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit265, Lit28, Lit267, Lit14);
    }

    static Object lambda98() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit270, Lit33, Lit34, Lit14);
    }

    static Object lambda99() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit270, Lit33, Lit34, Lit14);
    }

    static Object lambda100() {
        C0609runtime.setAndCoerceProperty$Ex(Lit273, Lit15, Lit274, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit273, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit273, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit273, Lit27, "30", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit273, Lit28, Lit275, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit273, Lit19, Lit171, Lit14);
    }

    static Object lambda101() {
        C0609runtime.setAndCoerceProperty$Ex(Lit273, Lit15, Lit274, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit273, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit273, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit273, Lit27, "30", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit273, Lit28, Lit275, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit273, Lit19, Lit171, Lit14);
    }

    public Object Button14$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit273, Lit15, Lit277, Lit14);
    }

    static Object lambda102() {
        C0609runtime.setAndCoerceProperty$Ex(Lit280, Lit15, Lit281, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit280, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit280, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit280, Lit27, "166", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit280, Lit28, Lit282, Lit14);
    }

    static Object lambda103() {
        C0609runtime.setAndCoerceProperty$Ex(Lit280, Lit15, Lit281, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit280, Lit39, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit280, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit280, Lit27, "166", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit280, Lit28, Lit282, Lit14);
    }

    public Object Button16$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit280, Lit15, Lit284, Lit14);
    }

    static Object lambda104() {
        C0609runtime.setAndCoerceProperty$Ex(Lit287, Lit15, Lit288, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit287, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit287, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit287, Lit27, "110", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit287, Lit28, Lit289, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit287, Lit19, Lit290, Lit14);
    }

    static Object lambda105() {
        C0609runtime.setAndCoerceProperty$Ex(Lit287, Lit15, Lit288, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit287, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit287, Lit40, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit287, Lit27, "110", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit287, Lit28, Lit289, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit287, Lit19, Lit290, Lit14);
    }

    public Object Button13$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit287, Lit15, Lit292, Lit14);
    }

    static Object lambda106() {
        C0609runtime.setAndCoerceProperty$Ex(Lit295, Lit15, Lit296, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit295, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit295, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit295, Lit27, "64", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit295, Lit28, Lit297, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit295, Lit19, Lit171, Lit14);
    }

    static Object lambda107() {
        C0609runtime.setAndCoerceProperty$Ex(Lit295, Lit15, Lit296, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit295, Lit39, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit295, Lit40, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit295, Lit27, "64", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit295, Lit28, Lit297, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit295, Lit19, Lit171, Lit14);
    }

    public Object correct_ans4$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit295, Lit15, Lit299, Lit14);
    }

    static Object lambda108() {
        C0609runtime.setAndCoerceProperty$Ex(Lit302, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit302, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit302, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit302, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit302, Lit27, "A", Lit4);
    }

    static Object lambda109() {
        C0609runtime.setAndCoerceProperty$Ex(Lit302, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit302, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit302, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit302, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit302, Lit27, "A", Lit4);
    }

    static Object lambda110() {
        C0609runtime.setAndCoerceProperty$Ex(Lit305, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit305, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit305, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit305, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit305, Lit27, "C", Lit4);
    }

    static Object lambda111() {
        C0609runtime.setAndCoerceProperty$Ex(Lit305, Lit39, Lit41, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit305, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit305, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit305, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit305, Lit27, "C", Lit4);
    }

    static Object lambda112() {
        C0609runtime.setAndCoerceProperty$Ex(Lit308, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit308, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit308, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit308, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit308, Lit27, "B", Lit4);
    }

    static Object lambda113() {
        C0609runtime.setAndCoerceProperty$Ex(Lit308, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit308, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit308, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit308, Lit40, Lit41, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit308, Lit27, "B", Lit4);
    }

    static Object lambda114() {
        C0609runtime.setAndCoerceProperty$Ex(Lit311, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit311, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit311, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit311, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit311, Lit27, "D", Lit4);
    }

    static Object lambda115() {
        C0609runtime.setAndCoerceProperty$Ex(Lit311, Lit39, Lit43, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit311, Lit68, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit311, Lit69, Lit70, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit311, Lit40, Lit53, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit311, Lit27, "D", Lit4);
    }

    static Object lambda116() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit314, Lit17, Lit315, Lit14);
    }

    static Object lambda117() {
        return C0609runtime.setAndCoerceProperty$Ex(Lit314, Lit17, Lit315, Lit14);
    }

    static Object lambda118() {
        C0609runtime.setAndCoerceProperty$Ex(Lit318, Lit12, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit318, Lit319, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit318, Lit15, Lit320, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit318, Lit19, Lit321, Lit14);
    }

    static Object lambda119() {
        C0609runtime.setAndCoerceProperty$Ex(Lit318, Lit12, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit318, Lit319, Lit13, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit318, Lit15, Lit320, Lit14);
        return C0609runtime.setAndCoerceProperty$Ex(Lit318, Lit19, Lit321, Lit14);
    }

    static Object lambda120() {
        C0609runtime.setAndCoerceProperty$Ex(Lit324, Lit15, Lit325, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit324, Lit69, Lit326, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit324, Lit42, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit324, Lit27, "DONE", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit324, Lit28, Lit327, Lit14);
    }

    static Object lambda121() {
        C0609runtime.setAndCoerceProperty$Ex(Lit324, Lit15, Lit325, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit324, Lit69, Lit326, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit324, Lit42, Lit53, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit324, Lit27, "DONE", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit324, Lit28, Lit327, Lit14);
    }

    public Object submit$Click() {
        C0609runtime.setThisForm();
        return C0609runtime.callYailPrimitive(C0609runtime.open$Mnanother$Mnscreen, LList.list1("Pollution_Bhaktapur"), Lit329, "open another screen");
    }

    static Object lambda122() {
        C0609runtime.setAndCoerceProperty$Ex(Lit332, Lit15, Lit333, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit332, Lit17, Lit334, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit332, Lit335, "ScreenShot2020-10-04at9.02.21AM.png", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit332, Lit336, Boolean.FALSE, Lit7);
        return C0609runtime.setAndCoerceProperty$Ex(Lit332, Lit19, Lit18, Lit14);
    }

    static Object lambda123() {
        C0609runtime.setAndCoerceProperty$Ex(Lit332, Lit15, Lit333, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit332, Lit17, Lit334, Lit14);
        C0609runtime.setAndCoerceProperty$Ex(Lit332, Lit335, "ScreenShot2020-10-04at9.02.21AM.png", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit332, Lit336, Boolean.FALSE, Lit7);
        return C0609runtime.setAndCoerceProperty$Ex(Lit332, Lit19, Lit18, Lit14);
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
        Bhaktapur = this;
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
