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
package chapter21_concurrent.barrier;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Description of this file.
 *
 * @author XiongNeng
 * @version 1.0
 * @since 13-1-10
 */

/**
 * 线程池名称
 * User: 谢炜
 * Date: 12-6-13
 * Time: 上午9:37
 * To change this template use File | Settings | File Templates.
 */
class NamedThreadPoolFactory implements ThreadFactory {
    String name;
    final AtomicInteger threadNumber = new AtomicInteger(1);

    NamedThreadPoolFactory(String name) {
        this.name = name;
    }

    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, name + threadNumber.getAndIncrement());
        return t;
    }
}
