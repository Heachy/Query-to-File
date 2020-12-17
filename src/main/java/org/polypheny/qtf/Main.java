/*
 * Copyright 2019-2020 The Polypheny Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.polypheny.qtf;


public class Main {

    public static void main( String[] args ) {
        Main main = new Main();
        main.loadLibFuse();
        MainApp.run( new String[]{} );
    }

    public void loadLibFuse() {
        //see https://github.com/RaiMan/SikuliX1/issues/350
        // and https://stackoverflow.com/questions/2370545/how-do-i-make-a-target-library-available-to-my-java-app
        System.setProperty( "jna.library.path", "/usr/local/lib/" );
        System.load( "/usr/local/lib/libfuse.2.dylib" );
    }

}