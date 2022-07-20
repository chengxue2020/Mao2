package com.github.catvod.spider;

import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.AbstractC0607xp;
import com.github.catvod.spider.merge.C0126Ji;
import com.github.catvod.spider.merge.C0181OK;
import com.github.catvod.spider.merge.C0293Xa;
import com.github.catvod.spider.merge.C0336d1;
import com.github.catvod.spider.merge.C0611xz;
import com.github.catvod.spider.merge.C0612y4;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Czsapp extends Spider {

    /* renamed from: $ */
    private static short[] f55$ = {2199, 2281, 2275, 2192, 2197, 2199, 2281, 2198, 2272, 2274, 2199, 2281, 2288, 2237, 2218, 2233, 2283, 2192, 2199, 2223, 2199, 2236, 2198, 2272, 2294, 2221, 2238, 2213, 2216, 2239, 2210, 2212, 2213, 2283, 2223, 2213, 2216, 2233, 2226, 2277, 2273, 2214, 2223, 2302, 2277, 2222, 2213, 2216, 2277, 2206, 2239, 2221, 2291, 2277, 2235, 2218, 2233, 2232, 2222, 2199, 2275, 2199, 2281, 2275, 2192, 2199, 2223, 2199, 2236, 2198, 2272, 2274, 2199, 2281, 2277, 2273, 2214, 2223, 2302, 2277, 2222, 2213, 2216, 2277, 2206, 2239, 2221, 2291, 2277, 2235, 2218, 2233, 2232, 2222, 2199, 2275, 2275, 2192, 2199, 2223, 2198, 2272, 2274, 2199, 2274, 7229, 7202, 7215, 7214, 7204, 7281, 7275, 7191, 7216, 7230, 7225, 7207, 7281, 7275, 7191, 7273, 7267, 7184, 7189, 7191, 7273, 7190, 7264, 7266, 7191, 7273, 6318, 6312, 6335, 6313, 6324, 6313, 6321, 6328, 6375, 6397, 6273, 6310, 6312, 6319, 6321, 6375, 6273, 6399, 6389, 6278, 6275, 6273, 6399, 6272, 6390, 6273, 6387, 6315, 6313, 6313, 6388, 6273, 6399, 909, 908, 925, 964, 990, 985, 982, 933, 928, 985, 931, 981, 930, 976, 925, 909, 909, 983, 985, 978, 12237, 12175, 12173, 12180, 12171, 12167, 12237, 12234, 12222, 12166, 12233, 12235, 12236, 12170, 12182, 12175, 12174, 3338, 3413, 3396, 3394, 3392, 3338, 3341, 3449, 3393, 3342, 3340, 10985, 10928, 10905, 10934, 10922, 10919, 10943, 10985, 10990, 10984, 10988, 10991, 10906, 10984, 10926, 10930, 10923, 10922, 5357, 5370, 5353, 5307, 5357, 5360, 5374, 5346, 5307, 5286, 5307, 5312, 5308, 5319, 5305, 5318, 5299, 5312, 5317, 5308, 5319, 5305, 5318, 5296, 5298, 5312, 5308, 5319, 5305, 5318, 2468, 2483, 2464, 2546, 2484, 2468, 2489, 2487, 2475, 2546, 2543, 2546, 2441, 2549, 2446, 2544, 2447, 2554, 2441, 2444, 2549, 2446, 2544, 2447, 2553, 2555, 2441, 2549, 2446, 2544, 2447, 6034, 6021, 6038, 6084, 6033, 6021, 6084, 6105, 6084, 6079, 6083, 6072, 6086, 6073, 6092, 6079, 6074, 6083, 6072, 6086, 6073, 6095, 6093, 6079, 6083, 6072, 6086, 6073, 11481, 11470, 11485, 11407, 11468, 11462, 11487, 11407, 11410, 11407, 11508, 11400, 11507, 11405, 11506, 11399, 11508, 11505, 11400, 11507, 11405, 11506, 11396, 11398, 11508, 11400, 11507, 11405, 11506, 11186, 11173, 11190, 11236, 11184, 11181, 11177, 11169, 11236, 11257, 11236, 11167, 11235, 11160, 11238, 11161, 11244, 11167, 11162, 11235, 11160, 11238, 11161, 11247, 11245, 11167, 11235, 11160, 11238, 11161, 3020, 3035, 3016, 2970, 3023, 3016, 3030, 2970, 2951, 2970, 3041, 2973, 3046, 2968, 3047, 2962, 3041, 3044, 2973, 3046, 2968, 3047, 2961, 2963, 3041, 2973, 3046, 2968, 3047, 12068, 12077, 12124, 215, 7892, 7922, 7908, 7923, 7852, 7872, 7910, 7908, 7919, 7925, 11854, 11884, 11897, 11882, 11887, 11887, 11874, 11820, 11830, 11821, 11827, 11811, 11819, 11854, 11874, 11872, 11882, 11885, 11895, 11884, 11888, 11883, 11832, 11811, 11850, 11885, 11895, 11878, 11887, 11811, 11854, 11874, 11872, 11811, 11852, 11856, 11811, 11867, 11811, 11826, 11827, 11868, 11826, 11830, 11868, 11828, 11818, 11811, 11842, 11891, 11891, 11887, 11878, 11860, 11878, 11873, 11848, 11882, 11895, 11820, 11830, 11824, 11828, 11821, 11824, 11829, 11811, 11819, 11848, 11851, 11863, 11854, 11855, 11823, 11811, 11887, 11882, 11880, 11878, 11811, 11844, 11878, 11872, 11880, 11884, 11818, 11811, 11840, 11883, 11889, 11884, 11886, 11878, 11820, 11826, 11827, 11827, 11821, 11827, 11821, 11831, 11835, 11834, 11829, 11821, 11828, 11830, 11811, 11856, 11874, 11877, 11874, 11889, 11882, 11820, 11830, 11824, 11828, 11821, 11824, 11829, 7811, 7815, 7821, 13915, 13889, 13910, 13909, 2130, 2126, 2126, 2122, 2121, 2048, 2069, 2069, 2137, 2112, 2121, 2122, 2122, 2068, 2137, 2133, 2135, 2069, 1205, 1258, 1275, 1277, 1279, 1205, 13157, 13160, 13175, 13103, 13169, 13152, 13158, 13156, 13167, 13152, 13175, 13160, 13150, 13173, 13177, 13173, 13089, 13119, 13089, 13152, 13103, 13156, 13177, 13173, 13156, 13167, 13157, 6873, 6868, 6859, 6803, 6864, 6868, 6882, 6867, 6872, 6882, 6870, 6873, 6813, 6787, 6813, 6856, 6865, 6813, 6787, 6813, 6865, 6868, 7011, 2864, 2877, 2853, 3695, 3690, 3711, 3690, 3622, 3684, 3705, 3682, 3692, 3682, 3685, 3690, 3687, 1753, 1748, 1739, 1683, 1749, 1753, 1748, 1747, 1755, 1746, 1693, 1667, 1693, 1742, 1741, 1756, 1747, 5157, 5180, 5175, 5132, 5178, 5175, 2516, 2509, 2502, 2557, 2508, 2499, 2511, 2503, 1162, 1171, 1176, 1187, 1164, 1173, 1183, 5136, 5129, 5122, 5177, 5140, 5123, 5131, 5127, 5140, 5133, 5141, 6293, 6288, 6282, 6285, 13278, 13263, 13257, 13259, 3230, 3215, 3209, 3211, 3213, 3201, 3227, 3200, 3226, 2748, 2745, 2749, 2745, 2724, 2784, 2811, 2784, 2805, 2808, -15481, -15461, -15461, -15457, -15460, -15403, -15424, -15424, -15476, -15467, -15460, -15457, -15457, -15423, -15476, -15488, -15486, -15424, -15486, -15488, -15463, -15482, -15478, -15424, -4622, -4684, -4696, -4687, -4688, -5305, -5302, -5291, -5363, -5298, -5300, -5291, -5302, -5306, -5305, -5289, -5306, -5310, -5302, -5297, -5252, -5289, -5289, -5373, -5347, -5373, -5301, -5358, -5572, -5583, -5586, -5514, -5572, -5599, -5583, -5579, -5569, -5512, -5530, -5512, -5583, -5579, -5569, -15872, -15871, -15856, -8150, -8141, -8079, -8142, -8144, -8151, -8138, -8134, -8133, -8149, -8134, -8130, -8138, -8141, -8192, -8141, -8138, -8148, -8149, -8065, -8095, -8065, -8141, -8138, -18114, -27954, -20771, -21801, -25727, -29944, -20826, -26034, -19607, -28090, 32669, -30920, -6997, -6990, -6983, -7038, -6988, -6983, -6204, -6179, -6186, -6163, -6180, -6189, -6177, -6185, -7619, -7644, -7633, -7660, -7621, -7646, -7640, -352, -339, -348, -335, -373, -326, -331, -327, -335, -6225, -6218, -6211, -6266, -6240, -6212, -6216, -6229, -6424, -6415, -6406, -6463, -6401, -6420, -6405, -6401, -2778, -2753, -2764, -2801, -2782, -2763, -2755, -2767, -2782, -2757, -2781, -7189, -7182, -7175, -7230, -7172, -7170, -7191, -7182, -7185, -15731, -15724, -15713, -15708, -15713, -15726, -15735, -15714, -15720, -15729, -15724, -15735, -6449, -6442, -6435, -6426, -6438, -6442, -6441, -6451, -6436, -6441, -6451, -15644, -15639, -15626, -15698, -15623, -15632, -15649, -15645, -15633, -15634, -15628, -15643, -15624, -15628, -16320, -16295, -16302, -16279, -16314, -16294, -16297, -16305, -16279, -16304, -16316, -16295, -16293, -22932, 24721, 30890, -25730, -929, -942, -947, -1003, -949, -934, -937, -958, -924, -937, -942, -952, -945, -924, -935, -945, -939, -997, -1019, -997, -934, -7688, -7710, -7691, -7690, -5417, -150, -141, -136, -189, -148, -144, -131, -155, -189, -151, -146, -144, -2848, -16245, -16242, -16236, -16237, 18664, 18668, 18662, 28772, 28792, 28792, 28796, 28799, 28726, 28707, 28707, 28783, 28790, 28799, 28796, 28796, 
    28706, 28783, 28771, 28769, 25617, 25681, 25694, 25673, 25683, 25686, 25676, 25675, 25631, 25601, 25631, 25683, 25686, 25631, 25601, 25631, 25694, 28225, 28251, 28236, 28239, 29200, 29213, 29204, 29185, 29243, 29197, 29184, 29181, 29168, 29177, 29164, 29142, 29159, 29160, 29156, 29164, 27350, 27353, 27348, 27334, 27334, 18438, 18443, 18452, 18508, 18447, 18443, 18493, 18444, 18439, 18493, 18441, 18438, 18498, 18524, 18498, 18455, 18446, 18498, 18524, 18498, 18446, 18443, 19770, 31479, 31482, 31458, 31676, 31673, 31660, 31673, 31733, 31671, 31658, 31665, 31679, 31665, 31670, 31673, 31668, 19864, 19861, 19850, 19922, 19860, 19864, 19861, 19858, 19866, 19859, 19932, 19906, 19932, 19855, 19852, 19869, 19858, 31019, 31026, 31033, 30978, 31028, 31033, 26793, 26800, 26811, 26752, 26801, 26814, 26802, 26810, 19258, 19235, 19240, 19219, 19260, 19237, 19247, 26787, 26810, 26801, 26762, 26791, 26800, 26808, 26804, 26791, 26814, 26790, 27056, 27061, 27055, 27048, 32542, 32514, 32514, 32518, 32517, 32588, 32601, 32601, 32533, 32524, 32517, 32518, 32518, 32600, 32533, 32537, 32539, 32601, 32512, 32553, 32518, 32538, 32535, 32527, 32601, 31152, 31222, 31210, 31219, 31218, 29589, 29586, 29580, 25757, 25746, 25734, 25749, 25753, 25745, 25818, 25730, 25757, 25746, 25734, 25749, 25753, 25745, 27806, 27807, 27790, 32505, 32491, 32445, 32491, 32510, 32501, 32511, 32485, 32445, 32496, 32508, 32510, 25864, 25876, 25876, 25872, 25875, 25946, 25935, 25935, 25866, 25880, 25934, 25880, 25869, 25862, 25868, 25878, 25934, 25859, 25871, 25869, 25935, 25872, 25868, 25857, 25881, 25861, 25874, 25934, 25872, 25864, 25872, 25951, 25876, 25865, 25869, 25861, 25949, 16979, 16896, 16903, 16921, 16968, 32532, 32535, 32516, 32624, 32527, 32533, 32536, 32629, 32524, 32517, 32536, 32627, 32527, 32528, 32636, 32636, 16905, 16909, 16923, 16999, 16907, 16906, 16907, 16999, 16902, 16935, 16920, 16937, 16940, 16940, 16929, 16934, 16943, 28547, 28551, 28561, 29629, 29600, 29604, 29612, 24884, 24864, 16744, 16738, 16763, 17517, 17520, 17534, 17506, 29535, 29519, 29522, 29532, 29504, 16577, 16605, 16605, 16601, 16602, 16531, 16518, 16518, 16579, 16593, 16519, 16593, 16580, 16591, 16581, 16607, 16519, 16586, 16582, 16580, 16518, 16593, 16580, 16591, 16581, 16607, 16516, 16536, 16519, 16634, 16639, 16622, 29465, 29448, 29467, 29466, 29452, 27430, 30478, 30482, 30495, 30471, 30507, 30476, 30482, 29827, 29838, 29834, 29839, 29838, 29849, 29802, 29804, 29819, 29823, 28229, 28188, 28190, 28190, 28229, 28191, 28190, 28172, 28231, 28242, 27633, 27639, 27616, 27638, 26886, 26973, 26966, 26884, 26970, 26947, 26954, 26953, 26953, 26911, 26956, 26955, 26965, 26884, 12543, 12539, 12529, 9674, 9680, 9671, 9668, 8007, 7274, 7286, 7286, 7282, 7281, 7224, 7213, 7213, 7265, 7288, 7281, 7282, 7282, 7212, 7265, 7277, 7279, 7213, 7290, 7281, 7281, 7271, 7267, 7280, 7265, 7274, 7229, 7283, 7231, 11900, 11889, 11886, 11830, 11893, 11889, 11847, 11894, 11901, 11847, 11891, 11900, 11832, 11814, 11832, 11885, 11892, 11832, 11814, 11832, 11892, 11889, 8461, 8448, 8472, 9992, 9993, 10008, 6291, 6359, 6356, 6361, 6356, 14817, 14840, 14835, 14792, 14821, 14834, 14842, 14838, 14821, 14844, 14820, 8897, 8837, 8838, 8843, 8838, 8911, 8860, 8863, 8846, 8833, 15976, 15985, 15923, 15984, 15986, 15979, 15988, 15992, 15993, 15977, 15992, 15996, 15988, 15985, 15938, 15985, 15988, 15982, 15977, 15933, 15985, 15988, 15933, 15982, 15981, 15996, 15987, 8397, 8404, 8415, 8420, 8402, 8415, 13770, 13779, 13784, 13795, 13778, 13789, 13777, 13785, 8905, 8912, 8923, 8928, 8911, 8918, 8924, 12426, 12431, 12437, 12434};

    /* renamed from: PX */
    private static Pattern f60PX = Pattern.compile(m2138$(0, 105, 2251));

    /* renamed from: Fa */
    private static Pattern f57Fa = Pattern.compile(m2138$(105, 131, 7243));

    /* renamed from: j */
    private static Pattern f64j = Pattern.compile(m2138$(131, 164, 6365));

    /* renamed from: x */
    private static Pattern f67x = Pattern.compile(m2138$(164, 184, 1022));

    /* renamed from: h */
    private static Pattern f63h = Pattern.compile(m2138$(184, 201, 12258));

    /* renamed from: UP */
    private static Pattern f61UP = Pattern.compile(m2138$(201, 212, 3365));

    /* renamed from: zn */
    private static Pattern f68zn = Pattern.compile(m2138$(212, 230, 10950));

    /* renamed from: H */
    private static Pattern f58H = Pattern.compile(m2138$(230, 260, 5275));

    /* renamed from: F */
    private static Pattern f56F = Pattern.compile(m2138$(260, 291, 2514));

    /* renamed from: l */
    private static Pattern f65l = Pattern.compile(m2138$(291, 319, 6116));

    /* renamed from: Z */
    private static Pattern f62Z = Pattern.compile(m2138$(319, 348, 11439));

    /* renamed from: M */
    private static Pattern f59M = Pattern.compile(m2138$(348, 378, 11204));

    /* renamed from: tD */
    private static Pattern f66tD = Pattern.compile(m2138$(378, 407, 3002));

    /* renamed from: $ */
    private static String m2138$(int i, int i2, int i3) {
        char[] cArr = new char[i2 - i];
        for (int i4 = 0; i4 < i2 - i; i4++) {
            cArr[i4] = (char) (f55$[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: PX */
    private String m2136PX(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(m2138$(407, 410, 12137));
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = m2138$(410, 411, 231) + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: Fa */
    protected HashMap<String, String> m2137Fa() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(m2138$(411, 421, 7809), m2138$(421, 542, 11779));
        return hashMap;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String m2138$ = m2138$(542, 545, 7914);
        String m2138$2 = m2138$(545, 549, 13875);
        try {
            JSONObject jSONObject = new JSONObject();
            C0126Ji m1140PX = C0293Xa.m1140PX(C0181OK.m1458M(m2138$(549, 567, 2106) + str + m2138$(567, 573, 1178) + str2, m2137Fa()));
            int parseInt = Integer.parseInt(str2);
            int parseInt2 = Integer.parseInt(str2);
            Matcher matcher = f61UP.matcher(m1140PX.m954zI(m2138$(573, 600, 13057)).m117x().mo248j(m2138$2));
            if (matcher.find()) {
                parseInt2 = Integer.parseInt(matcher.group(1));
            }
            C0612y4 m954zI = m1140PX.m954zI(m2138$(600, 622, 6845));
            JSONArray jSONArray = new JSONArray();
            Iterator<C0336d1> it = m954zI.iterator();
            while (it.hasNext()) {
                C0336d1 next = it.next();
                Matcher matcher2 = f63h.matcher(next.m954zI(m2138$(622, 623, 6914)).m121PX(m2138$2));
                if (matcher2.find()) {
                    String group = matcher2.group(1);
                    String trim = next.m954zI(m2138$).m121PX(m2138$(623, 626, 2897)).trim();
                    String trim2 = next.m954zI(m2138$).m121PX(m2138$(626, 639, 3595)).trim();
                    String trim3 = next.m954zI(m2138$(639, 656, 1725)).m116zn().trim();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(m2138$(656, 662, 5203), group);
                    jSONObject2.put(m2138$(662, 670, 2466), trim);
                    jSONObject2.put(m2138$(670, 677, 1276), trim2);
                    jSONObject2.put(m2138$(677, 688, 5222), trim3);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put(m2138$(688, 692, 6393), jSONArray);
            jSONObject.put(m2138$(692, 696, 13230), parseInt);
            jSONObject.put(m2138$(696, 705, 3310), parseInt2);
            jSONObject.put(m2138$(705, 710, 2768), 24);
            jSONObject.put(m2138$(710, 715, 2708), parseInt2 <= 1 ? jSONArray.length() : parseInt2 * 24);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            C0126Ji m1140PX = C0293Xa.m1140PX(C0181OK.m1458M(m2138$(715, 739, -15377) + list.get(0) + m2138$(739, 744, -4644), m2137Fa()));
            String trim = m1140PX.m954zI(m2138$(744, 767, -5341)).m116zn().trim();
            String m121PX = m1140PX.m954zI(m2138$(767, 782, -5544)).m121PX(m2138$(782, 785, -15757));
            Iterator<C0336d1> it = m1140PX.m954zI(m2138$(785, 809, -8097)).iterator();
            String str = "";
            String str2 = str;
            String str3 = str2;
            String str4 = str3;
            String str5 = str4;
            String str6 = str5;
            while (it.hasNext()) {
                String trim2 = it.next().m984T().trim();
                Iterator<C0336d1> it2 = it;
                JSONObject jSONObject3 = jSONObject;
                if (trim2.length() >= 4) {
                    try {
                        String substring = trim2.substring(0, 2);
                        String substring2 = trim2.substring(3);
                        if (substring.equals(m2138$(809, 811, -15035))) {
                            str = substring2;
                        } else if (substring.equals(m2138$(811, 813, -1555))) {
                            str3 = substring2;
                        } else if (substring.equals(m2138$(813, 815, -14859))) {
                            str2 = substring2;
                        } else if (substring.equals(m2138$(815, 817, -2726))) {
                            str6 = substring2;
                        } else if (substring.equals(m2138$(817, 819, -686))) {
                            str5 = substring2;
                        } else if (substring.equals(m2138$(819, 821, -3109))) {
                            str4 = substring2;
                        }
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                        return "";
                    }
                }
                it = it2;
                jSONObject = jSONObject3;
            }
            JSONObject jSONObject4 = jSONObject;
            jSONObject2.put(m2138$(821, 827, -6947), list.get(0));
            jSONObject2.put(m2138$(827, 835, -6222), trim);
            jSONObject2.put(m2138$(835, 842, -7605), m121PX);
            jSONObject2.put(m2138$(842, 851, -300), str);
            jSONObject2.put(m2138$(851, 859, -6183), str2);
            jSONObject2.put(m2138$(859, 867, -6498), str3);
            jSONObject2.put(m2138$(867, 878, -2736), str4);
            jSONObject2.put(m2138$(878, 887, -7267), str5);
            jSONObject2.put(m2138$(887, 899, -15621), str6);
            jSONObject2.put(m2138$(899, 910, -6471), m1140PX.m954zI(m2138$(910, 924, -15744)).m116zn().trim());
            jSONObject2.put(m2138$(924, 937, -16330), m2138$(937, 941, -2578));
            ArrayList arrayList = new ArrayList();
            Iterator<C0336d1> it3 = m1140PX.m954zI(m2138$(941, 962, -965)).iterator();
            while (it3.hasNext()) {
                C0336d1 next = it3.next();
                Matcher matcher = f68zn.matcher(next.mo248j(m2138$(962, 966, -7792)));
                if (matcher.find()) {
                    arrayList.add(next.m984T() + m2138$(966, 967, -5389) + matcher.group(1));
                }
            }
            jSONObject2.put(m2138$(967, 979, -228), TextUtils.join(m2138$(979, 980, -2877), arrayList));
            jSONArray.put(jSONObject2);
            jSONObject4.put(m2138$(980, 984, -16153), jSONArray);
            return jSONObject4.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public String homeContent(boolean z) {
        String m2138$;
        String m2138$2 = m2138$(984, 987, 18561);
        try {
            JSONObject jSONObject = new JSONObject();
            C0126Ji m1140PX = C0293Xa.m1140PX(C0181OK.m1458M(m2138$(987, 1004, 28684), m2137Fa()));
            C0612y4 m954zI = m1140PX.m954zI(m2138$(1004, 1021, 25663));
            JSONArray jSONArray = new JSONArray();
            Iterator<C0336d1> it = m954zI.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                m2138$ = m2138$(1021, 1025, 28201);
                if (!hasNext) {
                    break;
                }
                C0336d1 next = it.next();
                String mo248j = next.mo248j(m2138$);
                if (mo248j.length() > 1) {
                    String substring = mo248j.substring(1);
                    String trim = next.m984T().trim();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(m2138$(1025, 1032, 29284), substring);
                    jSONObject2.put(m2138$(1032, 1041, 29065), trim);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put(m2138$(1041, 1046, 27317), jSONArray);
            C0612y4 m954zI2 = m1140PX.m954zI(m2138$(1046, 1068, 18530));
            JSONArray jSONArray2 = new JSONArray();
            Iterator<C0336d1> it2 = m954zI2.iterator();
            while (it2.hasNext()) {
                C0336d1 next2 = it2.next();
                Matcher matcher = f63h.matcher(next2.m954zI(m2138$(1068, 1069, 19803)).m121PX(m2138$));
                if (matcher.find()) {
                    String group = matcher.group(1);
                    String trim2 = next2.m954zI(m2138$2).m121PX(m2138$(1069, 1072, 31382)).trim();
                    String trim3 = next2.m954zI(m2138$2).m121PX(m2138$(1072, 1085, 31704)).trim();
                    String trim4 = next2.m954zI(m2138$(1085, 1102, 19964)).m116zn().trim();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(m2138$(1102, 1108, 31069), group);
                    jSONObject3.put(m2138$(1108, 1116, 26847), trim2);
                    jSONObject3.put(m2138$(1116, 1123, 19276), trim3);
                    jSONObject3.put(m2138$(1123, 1134, 26837), trim4);
                    jSONArray2.put(jSONObject3);
                }
            }
            jSONObject.put(m2138$(1134, 1138, 27100), jSONArray2);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3;
        String str4;
        C0612y4 m954zI;
        try {
            String m1458M = C0181OK.m1458M(m2138$(1138, 1163, 32630) + str2 + m2138$(1163, 1168, 31134), m2137Fa());
            C0126Ji m1140PX = C0293Xa.m1140PX(m1458M);
            Matcher matcher = f60PX.matcher(m1458M);
            if (matcher.find()) {
                String m127Fa = C0611xz.m127Fa(matcher.group(1), matcher.group(2), matcher.group(3));
                Matcher matcher2 = f57Fa.matcher(m127Fa);
                str4 = matcher2.find() ? matcher2.group(1) : "";
                Matcher matcher3 = f64j.matcher(m127Fa);
                str3 = matcher3.find() ? matcher3.group(1) : "";
            } else {
                str3 = "";
                str4 = str3;
            }
            boolean isEmpty = TextUtils.isEmpty(str4);
            String m2138$ = m2138$(1168, 1171, 29664);
            if (isEmpty && (m954zI = m1140PX.m954zI(m2138$(1171, 1185, 25844))) != null) {
                String m121PX = m954zI.m121PX(m2138$(1185, 1188, 27885));
                if (m121PX.contains(m2138$(1188, 1200, 32403))) {
                    String m1458M2 = C0181OK.m1458M(m121PX, m2137Fa());
                    Matcher matcher4 = f59M.matcher(m1458M2);
                    if (!matcher4.find()) {
                        return "";
                    }
                    String group = matcher4.group(1);
                    Matcher matcher5 = f66tD.matcher(m1458M2);
                    if (!matcher5.find()) {
                        return "";
                    }
                    String group2 = matcher5.group(1);
                    String m1458M3 = C0181OK.m1458M(m2138$(1200, 1237, 25952) + group + m2138$(1237, 1242, 17013) + group2, m2137Fa());
                    Matcher matcher6 = f58H.matcher(m1458M3);
                    if (!matcher6.find()) {
                        return "";
                    }
                    String group3 = matcher6.group(1);
                    Matcher matcher7 = f56F.matcher(m1458M3);
                    if (!matcher7.find()) {
                        return "";
                    }
                    String group4 = matcher7.group(1);
                    Matcher matcher8 = f65l.matcher(m1458M3);
                    if (!matcher8.find()) {
                        return "";
                    }
                    String group5 = matcher8.group(1);
                    Matcher matcher9 = f62Z.matcher(m1458M3);
                    if (!matcher9.find()) {
                        return "";
                    }
                    String group6 = matcher9.group(1);
                    Matcher matcher10 = f59M.matcher(m1458M3);
                    if (!matcher10.find()) {
                        return "";
                    }
                    String group7 = matcher10.group(1);
                    byte[] bytes = m2136PX(group4).getBytes();
                    byte[] bytes2 = m2138$(1242, 1258, 32577).getBytes();
                    Cipher cipher = Cipher.getInstance(m2138$(1258, 1275, 16968));
                    cipher.init(1, new SecretKeySpec(bytes, m2138$(1275, 1278, 28610)), new IvParameterSpec(bytes2));
                    String encodeToString = Base64.encodeToString(cipher.doFinal(group4.getBytes()), 0);
                    AbstractC0607xp.AbstractC0608a abstractC0608a = new AbstractC0607xp.AbstractC0608a() { // from class: com.github.catvod.spider.Czsapp.1
                        @Override // com.github.catvod.spider.merge.AbstractC0607xp
                        public void onFailure(Call call, Exception exc) {
                        }

                        public void onResponse(Response response) {
                        }
                    };
                    HashMap hashMap = new HashMap();
                    hashMap.put(m2138$, group2);
                    hashMap.put(m2138$(1278, 1282, 29641), group7);
                    hashMap.put(m2138$(1282, 1284, 24897), group5);
                    hashMap.put(m2138$(1284, 1287, 16651), group6);
                    hashMap.put(m2138$(1287, 1291, 17435), group3);
                    hashMap.put(m2138$(1291, 1296, 29497), encodeToString);
                    C0181OK.m1461F(C0181OK.m1452j(), m2138$(1296, 1328, 16553), hashMap, m2137Fa(), abstractC0608a);
                    str4 = new JSONObject(abstractC0608a.getResult().body().string()).getString(m2138$);
                } else {
                    Matcher matcher11 = f67x.matcher(C0181OK.m1458M(m121PX, m2137Fa()));
                    if (matcher11.find()) {
                        str4 = matcher11.group(1);
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(m2138$(1328, 1333, 29545), m2138$(1333, 1334, 27414));
            jSONObject.put(m2138$(1334, 1341, 30590), "");
            jSONObject.put(m2138$, str4);
            jSONObject.put(m2138$(1341, 1347, 29931), "");
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put(m2138$(1347, 1351, 29721), m2138$(1351, 1361, 28266));
                String m2138$2 = m2138$(1361, 1365, 27522);
                jSONObject.put(m2138$2, Proxy.localProxyUrl() + m2138$(1365, 1379, 26937) + URLEncoder.encode(str3));
            }
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        String m2138$ = m2138$(1379, 1382, 12438);
        String m2138$2 = m2138$(1382, 1386, 9634);
        String m2138$3 = m2138$(1386, 1387, 7974);
        try {
            JSONObject jSONObject = new JSONObject();
            C0612y4 m954zI = C0293Xa.m1140PX(C0181OK.m1458M(m2138$(1387, 1416, 7170) + URLEncoder.encode(str), m2137Fa())).m954zI(m2138$(1416, 1438, 11800));
            JSONArray jSONArray = new JSONArray();
            Iterator<C0336d1> it = m954zI.iterator();
            while (it.hasNext()) {
                C0336d1 next = it.next();
                Matcher matcher = f63h.matcher(next.m954zI(m2138$3).m121PX(m2138$2));
                JSONObject jSONObject2 = new JSONObject();
                if (matcher.find()) {
                    String group = matcher.group(1);
                    String trim = next.m954zI(m2138$).m121PX(m2138$(1438, 1441, 8556)).trim();
                    if (trim.contains(str)) {
                        String trim2 = next.m954zI(m2138$).m121PX(m2138$(1441, 1444, 10107)).trim();
                        boolean m993Jj = next.m993Jj(m2138$(1444, 1449, 6333));
                        String m2138$4 = m2138$(1449, 1460, 14743);
                        if (m993Jj) {
                            jSONObject2.put(m2138$4, next.m954zI(m2138$(1460, 1470, 8943)).m116zn());
                        } else {
                            String m984T = C0293Xa.m1140PX(C0181OK.m1458M(next.m954zI(m2138$3).m121PX(m2138$2), m2137Fa())).m954zI(m2138$(1470, 1497, 15901)).get(0).m984T();
                            jSONObject2.put(m2138$(1497, 1503, 8379), group);
                            jSONObject2.put(m2138$(1503, 1511, 13756), trim);
                            jSONObject2.put(m2138$(1511, 1518, 8895), trim2);
                            jSONObject2.put(m2138$4, m984T);
                            jSONArray.put(jSONObject2);
                        }
                    }
                }
            }
            jSONObject.put(m2138$(1518, 1522, 12518), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}