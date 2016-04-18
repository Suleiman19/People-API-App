package com.grafixartist.peoples;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Suleiman19 on 4/4/16.
 */
public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder> {
    List<String> names;

    public PeopleAdapter(List<String> names) {
        this.names = names;
    }

    @Override
    public PeopleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new PeopleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PeopleViewHolder holder, int position) {

        holder.textView.setText(names.get(position));

    }

    @Override
    public int getItemCount() {
        return names == null ? 0 : names.size();
    }

    class PeopleViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public PeopleViewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.list_item_text);
        }
    }
}
