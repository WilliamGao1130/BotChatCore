package org.bluepowerrobotics.letmeaskyou.core.conversation;

import java.util.List;

public class ConversationController {
    private Conversation conversation;


    public Message addChild(String parentId, Message message){
        return null;
    };       // 在某节点下添加子节点

    public Message regenerate(String messageId){
        return null;
    };                     // 重新生成（创建兄弟节点）

    public Message editMessage(String messageId, String newContent){
        return null;
    }; // 编辑消息

    public void deleteMessage(String messageId){

    };                     // 删除节点，子节点归父

    public List<Message> getPathFromRoot(String messageId){
        return null;
    };            // 获取从根到输入ID的路径

    public List<Message> getSiblings(String messageId){
        return null;
    };              // 获取所有兄弟（不同版本）

    public void switchBranch(String messageId){

    };                      // 切换活跃分支（输入message无子节点）

}
