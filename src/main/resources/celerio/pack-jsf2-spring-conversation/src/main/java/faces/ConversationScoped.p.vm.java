## Copyright 2015 JAXIO http://www.jaxio.com
##
## Licensed under the Apache License, Version 2.0 (the "License");
## you may not use this file except in compliance with the License.
## You may obtain a copy of the License at
##
##    http://www.apache.org/licenses/LICENSE-2.0
##
## Unless required by applicable law or agreed to in writing, software
## distributed under the License is distributed on an "AS IS" BASIS,
## WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
## See the License for the specific language governing permissions and
## limitations under the License.
##
$output.java($WebFaces, "ConversationScoped")##

$output.require("java.lang.annotation.RetentionPolicy")##
$output.require("java.lang.annotation.Retention")##
$output.require("org.springframework.context.annotation.Scope")##

/**
 * Beans in the 'conversation' scope reside in a {@link Conversation conversation}.
 * They are 'visible' only when the conversation is bound to the current thread of execution.
 */
@Scope("conversation")
@Retention(RetentionPolicy.RUNTIME)
public @interface $output.currentClass {
}
