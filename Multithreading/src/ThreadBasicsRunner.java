import jdk.nashorn.api.tree.NewTree;

//extends Thread
//implements Runnable
class Task1 extends Thread{
    public void run(){ //SIGNATURE
        System.out.print("\nTask1 Started");
        for(int i = 101; i<=199; i++){
            System.out.print(i + " ");
        }
        System.out.print("\nTask1 Done");
    }
}

class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.print("\nTask2 Started");
        for(int i = 201; i<=299; i++){
            System.out.print(i + " ");
        }
        System.out.print("\nTask2 Done");

    }
}

public class ThreadBasicsRunner {
//    task1 kicked off
//    task2 kicked off
//    Task1 Started
//    task3 kicked off
//    Task2 Started301 302 303 304 305 306 307 308 309 310 311 312 313 314 315 316 317 318 319 320 321 322 323 324 325 326 327 328 329 330 331 332 333 334 335 336 337 338 339 340 341 342 343 344 345 346 347 348 201 202 203 204 205 206 207 208 209 210 211 212 213 214 215 216 349 350 351 352 353 354 355 356 357 358 359 360 361 362 363 364 365 366 367 368 369 370 371 372 373 374 375 376 377 378 379 380 381 382 383 384 385 386 387 217 218 219 220 221 388 101 389 390 222 223 224 225 226 227 391 392 393 102 103 104 105 394 395 396 397 398 228 399
//    Task3 Done106 107 108 109 110 111 112 113 114 229 115 116 117 118 230 119 120 231 121 232 233 122 123 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 124 125 254 255 256 257 258 126 259 260 261 127 128 262 263 264 265 266 129 267 268 269 130 270 271 272 273 274 131 275 132 276 277 133 278 134 279 135 136 280 137 138 281 282 283 139 140 141 142 143 144 284 285 286 287 145 146 147 148 288 289 290 149 291 292 150 151 152 153 154 155 156 157 293 294 295 296 158 159 297 160 298 161 299
//    Task2 Done162 163 164 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 199
//    Task1 Don

//    New;
//    Runnable;
//    running;
//    blocked/waiting;
//    terminated/dead;

    public static void main(String[] args) throws InterruptedException {
        //Task 1
        System.out.print("\ntask1 kicked off");
        Task1 task1 = new Task1();
        task1.setPriority(1);
        task1.start();//task1.run()

        //Task 2
        System.out.print("\ntask2 kicked off");
        Runnable task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();

//        for(int i = 101; i<=199; i++){
//            System.out.print(i + " ");
//        }
//        System.out.print("\nTask1 Done");

//        System.out.print("\ntask2 kicked off");
        //Task 2
//        for(int i = 201; i <= 299; i++){
//            System.out.print(i + " ");
//        }
//        System.out.print("\nTask2 Done");
//
        //wait for task1 to complete
        task1.join();
        task2Thread.join();
        System.out.print("\ntask3 kicked off");
        //Task 3
        for(int i = 301; i<= 399; i++){
            System.out.print(i + " ");
        }
        System.out.print("\nTask3 Done");

    }
}
