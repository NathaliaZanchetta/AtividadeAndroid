package br.usjt.filaChamados;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


class ViewHolder{
    public ImageView filaIconImageView;
    public TextView statusChamadoNaFilaTextView;
    public TextView dataAberturaChamadoNaFilaTextView;
    public TextView dataFechamentoChamadoNaFilaTextView;
    public TextView descricaoChamadoNaFilaTextView;

    @Override
    public View getView(int position, View convertView, ViewGroup
            parent) {
        Chamado chamadoDaVez = getItem(position);
        Fila filaDaVez = chamadoDaVez.getFila();
        LayoutInflater inflater;
        inflater = (LayoutInflater) LayoutInflater.from(getContext());
        ViewHolder vh = null;
        if (convertView == null){
            convertView = inflater.inflate(R.layout.list_item, parent,
                    false);
            vh = new ViewHolder();
            vh.filaIconImageView =
                    convertView.findViewById(R.id.filaIconImageView);
            vh.descricaoChamadoNaFilaTextView =

                    convertView.findViewById(R.id.descricaoChamadoTextView);
            vh.statusChamadoNaFilaTextView =

                    convertView.findViewById(R.id.statusChamadoTextView);
            vh.dataAberturaChamadoNaFilaTextView =

                    convertView.findViewById(R.id.dataAberturaChamadoTextView);
            vh.dataFechamentoChamadoNaFilaTextView =

                    convertView.findViewById(R.id.dataFechamentoChamadoTextView);
            convertView.setTag(vh);
        }
        vh = (ViewHolder) convertView.getTag();
        vh.filaIconImageView.setImageResource(filaDaVez.getIconId());

        vh.descricaoChamadoNaFilaTextView.setText(chamadoDaVez.getDescricao(
        ));

        vh.statusChamadoNaFilaTextView.setText(chamadoDaVez.getStatus());

        vh.dataAberturaChamadoNaFilaTextView.setText(DateHelper.format(chamadoDaVez.getDataAbertura()));
        if (chamadoDaVez.getDataFechamento() != null){

            vh.dataFechamentoChamadoNaFilaTextView.setText(DateHelper.format(chamadoDaVez.getDataFechamento()));
        }
        return convertView;
    }

    private Chamado getItem(int position) {

        return null;
    }

}
