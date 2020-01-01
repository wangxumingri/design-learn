import org.apache.commons.lang3.StringUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TimeTest {
    public static void main(String[] args) {
        Map<String, String> timeMap = new HashMap<String, String>();
        timeMap.put("chineseDay", "-1");// 今天
//        timeMap.put("chineseTimeFlag", "1");// 上午

//        timeMap.put("chineseDay","0");// 今天
//        timeMap.put("chineseTimeFlag","1");// 下午

        handle(timeMap);
    }

    /**
     * 今天8点，今天上午9点 今天，今天上午，
     *
     * @param timeMap
     */
    public static void handle(Map<String, String> timeMap) {
        Calendar calendar = Calendar.getInstance();
        int currentHour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("当前小时:" + currentHour);
        String chineseDay = timeMap.get("chineseDay");
        String chineseTimeFlag = timeMap.get("chineseTimeFlag");
        String hour = timeMap.get("hour");
        if (null != hour && hour.length() != 0) {
            // 有小时
        } else {
            // 没有小时
            if (StringUtils.isNotEmpty(chineseDay)) {
                // 有日期：今天,昨天
                if (StringUtils.isNotEmpty(chineseTimeFlag)) {
                    // 又有上下午信息
                    switch (chineseDay) {
                        case "0":// 今天
                            // 先判断当前时间是上午还是下午
                            if (currentHour - 12 <=0) {
                                // 当前时间是上午
                                if ("0".equals(chineseTimeFlag)) {
                                    // 语言识别出上午
                                    int previousHour = currentHour - 2;// 当前时间-2小时
                                    if (previousHour > 0) {
                                        // 时间就取
                                        calendar.set(Calendar.HOUR_OF_DAY, previousHour);
                                    } else {
                                        calendar.set(Calendar.HOUR_OF_DAY, currentHour);
                                    }
                                }else {
                                    // 当前时间是上午，语言识别出下午，清空时间map，此次识别失效
                                    System.err.println("当前时间为上午，却识别到下午：此次识别失效");
                                    calendar = null;
                                }
                            } else {
                                // 当前时间是下午
                                if ("1".equals(chineseTimeFlag)){
                                    int previousHour = currentHour - 2;
                                    if (previousHour>=12){
                                        calendar.set(Calendar.HOUR_OF_DAY,previousHour);
                                    }else {
                                        calendar.set(Calendar.HOUR_OF_DAY,currentHour);
                                    }
                                }else {
                                    // 当前时间是下午，语言却识别出上午，置此次识别失效
                                    System.err.println("当前时间为下午，却识别到上午：此次识别失效");
                                    calendar = null;
                                }
                            }
                            break;
                        case "-1": // 昨天
                        case "-2": // 前天
                            if ("0".equals(chineseTimeFlag)) {
                                // 上午，默认8点
                                calendar.set(Calendar.HOUR_OF_DAY, 8);//
                            } else {
                                // 下午默认18点
                                calendar.set(Calendar.HOUR_OF_DAY, 18);
                            }
                            break;
                    }
                } else {
                    // 只有昨天，今天，前天，但没有上下午信息
                    int i = currentHour - 2;
                    if (i>0){
                        calendar.set(Calendar.HOUR_OF_DAY,i);
                    }else {
                        calendar.set(Calendar.HOUR_OF_DAY,currentHour);
                    }
                }
            } else {
                // 没有日期
            }
        }

        if (calendar != null){
            Date time = calendar.getTime();
            System.out.println(time);
            System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
            System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
            System.out.println(calendar.get(Calendar.MINUTE));
        }

    }



}
