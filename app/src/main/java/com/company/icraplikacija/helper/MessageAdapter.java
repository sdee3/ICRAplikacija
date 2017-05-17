package com.company.icraplikacija.helper;

import android.support.v7.widget.RecyclerView;

import com.company.icraplikacija.R;
import com.company.icraplikacija.models.Message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {

    private List<Message> messages;
    private Context mCtx;

    public MessageAdapter(List<Message> messages, Context mCtx) {
        this.messages = messages;
        this.mCtx = mCtx;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_messages, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MessageAdapter.ViewHolder holder, int position) {
        final Message message = messages.get(position);
        holder.textViewName.setText(message.getFrom());
        holder.textViewTitle.setText(message.getTitle());
        holder.textViewMessage.setText(message.getMessage());
        holder.textViewTime.setText(message.getSent());
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewTitle;
        TextView textViewMessage;
        TextView textViewTime;

        ViewHolder(View itemView) {
            super(itemView);

            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewTitle = (TextView) itemView.findViewById(R.id.textViewTitle);
            textViewMessage = (TextView) itemView.findViewById(R.id.textViewMessage);
            textViewTime = (TextView) itemView.findViewById(R.id.textViewTime);
        }
    }
}