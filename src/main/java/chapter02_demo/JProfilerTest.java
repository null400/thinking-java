/*
 * Created on 13-1-10
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Copyright @2013 the original author or authors.
 */
package chapter02_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description of this file.
 *
 * @author XiongNeng
 * @version 1.0
 * @since 13-1-10
 */
public class JProfilerTest {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<String>();
        for (int i = 0 ; i< 100;  i++) {
            list.add(String.valueOf(i));
        }
        List<String> list2 = new ArrayList<String>();
        for (int i = 0 ; i< 100;  i++) {
            list2.add(String.valueOf(i));
        }
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0 ; i< 100;  i++) {
            map.put("key"+i, String.valueOf(i));
        }
        System.out.println(list);
        System.out.println(list2);
        System.out.println(map);
        Thread.sleep(600000L);
    }
}
