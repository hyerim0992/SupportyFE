package com.example.supporty;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class TodayDrugListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DrugListEntity> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todaydrugslist);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        items = generateSampleItems();
        MedicationAdapter adapter = new MedicationAdapter(items);
        recyclerView.setAdapter(adapter);
    }

    private List<DrugListEntity> generateSampleItems() {
        List<DrugListEntity> items = new ArrayList<>();
        items.add(new DrugListEntity("아침 약", false));
        items.add(new DrugListEntity("점심 약", false));
        items.add(new DrugListEntity("저녁 약", false));
        return items;
    }

    static class MedicationAdapter extends RecyclerView.Adapter<MedicationAdapter.ViewHolder> {

        private final List<DrugListEntity> items;

        MedicationAdapter(List<DrugListEntity> items) {
            this.items = items;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.section_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            DrugListEntity item = items.get(position);
            holder.medicineName.setText(item.getName());
            holder.checkbox.setChecked(item.isChecked());
        }

        @Override
        public int getItemCount() {
            return items.size();
        }

        static class ViewHolder extends RecyclerView.ViewHolder {
            TextView medicineName;
            CheckBox checkbox;

            ViewHolder(View itemView) {
                super(itemView);
                medicineName = itemView.findViewById(R.id.tvMedicineName);
                checkbox = itemView.findViewById(R.id.checkbox);
            }
        }
    }
}
